package edu.ucne.tarea5.data.remote.dto

import edu.ucne.tarea5.data.remote.LibroApi
import edu.ucne.tarea5.data.remote.dto.ClienteDto
import edu.ucne.tarea5.data.remote.dto.LibroDto

import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val libroApi: LibroApi
) {

    suspend fun getAllCliente() = LibroApi.getAllCliente()
    suspend fun getCliente(id: Int) = LibroApi.getCliente(id)
    suspend fun saveCliente(clienteDto: ClienteDto) = LibroApi.saveCliente(clienteDto)
    suspend fun deleteCliente(id: Int) = LibroApi.deleteCliente(id)


    suspend fun getAllLibro() = LibroApi.getAllLibro()
    suspend fun getLibro(id: Int) = LibroApi.getLibro(id)
    suspend fun saveLibro(libroDto: LibroDto) = LibroApi.saveLibro(libroDto)
    suspend fun deleteLibro(id: Int) = LibroApi.deleteLibro(id)


}