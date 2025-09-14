package com.meatrix.diagi.data.local.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "health_measurements",
    foreignKeys = [
        ForeignKey(
            entity = User::class,
            parentColumns = ["id"],
            childColumns = ["user_id"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class HealthMeasurement(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "user_id") val userId: Int,
    val measurementTypeValue: Int,

    // Different value fields based on measurement type
    val value: Float? = null, // For weight, glucose, cholesterol, uric acid
    val systolic: Int? = null, // For blood pressure
    val diastolic: Int? = null, // For blood pressure
    val unit: String,

    @ColumnInfo(name = "measured_at") val measuredAt: Long = System.currentTimeMillis(),
    val notes: String? = null,
)
