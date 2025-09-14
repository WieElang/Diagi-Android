package com.meatrix.diagi.data.local.dao

import androidx.room.Delete
import androidx.room.Update
import androidx.room.Upsert

interface BaseDao<T> {
    @Upsert
    suspend fun updateOrCreate(entity: T): Long

    @Upsert
    suspend fun bulkCreate(entities: List<T>)

    @Update
    suspend fun update(entity: T)

    @Update
    suspend fun updateAll(entities: List<T>)

    @Delete
    suspend fun delete(entity: T)

    @Delete
    suspend fun deleteAll(entities: List<T>)
}