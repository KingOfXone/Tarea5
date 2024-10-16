package edu.ucne.tarea5.data.remote.repository

import edu.ucne.tarea5.data.remote.dto.ClienteDto
import javax.inject.Inject

class ClienteRepository @Inject constructor(
    private val clientesApi: ClientesApi
) {
    suspend fun saveCliente (cliente: ClienteDto) = clientesApi.SaveCliente(cliente)

    suspend fun deleteDelete(id: Int) = clientesApi.DeleteCliente(id)

    suspend fun getCliente(id: Int) = clientesApi.getCliente(id)

    suspend fun getAllCliente() = clientesApi.getAllCliente()

}