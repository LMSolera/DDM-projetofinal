package com.example.ddm_projetofinal.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

import com.example.ddm_projetofinal.data.entity.UserEntityLocal

@Database (
    entities = [UserEntityLocal::class],
    version = 1
)
abstract class UserLocalDatabase : RoomDatabase() {
    abstract val userLocalDao: UserLocalDao
}

object UserLocalDatabaseProvider {

    @Volatile
    private var INSTANCE: UserLocalDatabase? = null

    fun provide (context: Context): UserLocalDatabase {
        return INSTANCE ?: synchronized(this) {
            val instance = Room.databaseBuilder(
                context.applicationContext,
                UserLocalDatabase::class.java,
                "trip-app"
            ).build()
            INSTANCE = instance
            instance
        }
    }
}