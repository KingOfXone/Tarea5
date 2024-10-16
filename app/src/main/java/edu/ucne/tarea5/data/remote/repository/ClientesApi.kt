package edu.ucne.tarea5.data.remote.repository

import edu.ucne.tarea5.data.remote.dto.ClienteDto
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ClientesApi {

    @GET("api/Clientes/{id}")
    suspend fun getCliente(@Path("id") id: Int): ClienteDto
    @GET("api/Clientes")
    suspend fun getAllCliente(): List<ClienteDto>
    @POST("api/Clientes")
    suspend fun SaveCliente(@Body clienteDto: ClienteDto?): ClienteDto
    @DELETE("api/Clientes/{id}")
    suspend fun DeleteCliente(@Path("id") id: Int)


}