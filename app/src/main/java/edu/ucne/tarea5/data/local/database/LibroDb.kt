package edu.ucne.tarea5.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import edu.ucne.tarea5.data.local.dao.ClienteDao
import edu.ucne.tarea5.data.local.entities.ClienteEntity
import edu.ucne.tarea5.data.local.entities.LibroEntity

@Database(
    entities = [
        ClienteEntity::class,
        LibroEntity::class],

    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class LibroDb : RoomDatabase() {
    abstract fun ClienteDao(): ClienteDao
}