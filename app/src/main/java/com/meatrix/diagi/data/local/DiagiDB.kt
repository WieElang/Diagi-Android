package com.meatrix.diagi.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.meatrix.diagi.data.local.model.HealthMeasurement
import com.meatrix.diagi.data.local.model.MeasurementSession
import com.meatrix.diagi.data.local.model.User

@Database(
    entities = [
        User::class,
        HealthMeasurement::class,
        MeasurementSession::class
    ],
    version = 1,
    exportSchema = false
)
abstract class DiagiDB: RoomDatabase() {
    companion object {
        private var INSTANCE: DiagiDB? = null
        fun getInstance(context: Context): DiagiDB {
            if (INSTANCE == null) {
                synchronized(this) {
                    INSTANCE = Room.databaseBuilder(context, DiagiDB::class.java, "diagi_db")
                        .build()
                }
            }
            return INSTANCE!!
        }
    }
}