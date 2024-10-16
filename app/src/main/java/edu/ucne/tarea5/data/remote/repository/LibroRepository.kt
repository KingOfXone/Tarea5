package edu.ucne.tarea5.data.remote.repository

import edu.ucne.tarea5.data.remote.LibroApi
import edu.ucne.tarea5.data.remote.dto.ClienteDto
import edu.ucne.tarea5.presentation.navigation.Screen
import javax.inject.Inject

class LibroRepository @Inject constructor(
    private val libroApi: LibroApi
) {
    suspend fun saveLibro (libroApi: LibroApi) = libroApi.SaveLibro(libro)

    suspend fun deleteDelete(id: Int) = libroApi.DeleteLibro(id)

    suspend fun getLibro(id: Int) = libroApi.getLibro(id)

    suspend fun getAllLibro() = libroApi.getAllLibro()

}