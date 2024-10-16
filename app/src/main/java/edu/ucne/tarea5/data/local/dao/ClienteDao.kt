package edu.ucne.tarea5.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import edu.ucne.tarea5.data.local.entities.ClienteEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ClienteDao {
    @Upsert()
    suspend fun save(clienteEntity: ClienteEntity)
    @Query(
        """
            SELECT * FROM Clientes 
            WHERE clienteId = :id
            Limit 1
        """
    )
    suspend fun find(id: Int): ClienteEntity?
    @Query(
        """
            SELECT * FROM clientes
            WHERE cliente = :cliente
            LIMIT 1
        """
    )
    suspend fun searchCliente(cliente: String): ClienteEntity?
    @Query(
        """
            SELECT * FROM clientes
            WHERE asunto = :asunto
            LIMIT 1
        """
    )
    suspend fun searchAsunto(asunto: String): ClienteEntity?
    @Query(
        """
            SELECT * FROM clientes
            WHERE descripcion = :descripcion
            LIMIT 1
        """
    )
    suspend fun searchDescripcion(descripcion: String): ClienteEntity?
    @Delete
    suspend fun delete(prioridad: ClienteEntity)
    @Query("SELECT * FROM clientes")
    fun getAll(): Flow<List<ClienteEntity>>
}