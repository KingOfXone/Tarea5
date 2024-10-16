package edu.ucne.tarea5.data.remote

import edu.ucne.tarea5.data.remote.dto.LibroDto
import retrofit2.http.GET
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.POST
import retrofit2.http.Path

interface LibroApi {

    @GET("api/Libros/{id}")
    suspend fun getLibro(@Path("id") id: Int): LibroDto
    @GET("api/Libros")
    suspend fun getAllLibro(): List<LibroDto>
    @POST("api/Libros")
    suspend fun SaveLibro(@Body libroDto: LibroDto?): LibroDto
    @DELETE("api/Libros/{id}")
    suspend fun DeleteLibro(@Path("id") id: Int)
}