package com.meatrix.diagi.data.local.dao

import androidx.room.Dao
import com.meatrix.diagi.data.local.model.HealthMeasurement

@Dao
abstract class HealthMeasurementDao : BaseDao<HealthMeasurement>