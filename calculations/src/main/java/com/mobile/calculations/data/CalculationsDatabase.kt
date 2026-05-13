package com.mobile.calculations.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [DepositCalculation::class], version = 1, exportSchema = false)
abstract class CalculationsDatabase : RoomDatabase() {
    abstract fun depositDao(): DepositDao

    companion object {
        @Volatile private var INSTANCE: CalculationsDatabase? = null

        fun getDatabase(context: Context): CalculationsDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    CalculationsDatabase::class.java,
                    "deposits_db"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}