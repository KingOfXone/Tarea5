package edu.ucne.tarea5.data.di

import android.content.Context
import androidx.room.Room
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import edu.ucne.tarea5.data.local.database.LibroDb
import edu.ucne.tarea5.data.remote.LibroApi
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {
    @Provides
    @Singleton
    fun providePrioridadDb(@ApplicationContext appContext: Context) =
        Room.databaseBuilder(
            appContext,
            LibroDb::class.java,
            "Prioridad.db"
        ).fallbackToDestructiveMigration()
            .build()

    const val BASE_URL = "https://bibliotecaapi-a4fzdphweheshsbh.canadacentral-01.azurewebsites.net/"

    @Singleton
    @Provides
    fun providesMoshi(): Moshi =
        Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .add(DateAdater())
            .build()

    @Provides
    @Singleton
    fun provicesPrioridadesApi(moshi: Moshi): LibroApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
            .create(LibroApi::class.java)
    }

    @Provides
    @Singleton
    fun provideClienteDao(libroDb: LibroDb) = libroDb.ClienteDao()

}