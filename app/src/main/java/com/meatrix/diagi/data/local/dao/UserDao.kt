package com.meatrix.diagi.data.local.dao

import androidx.room.Dao
import com.meatrix.diagi.data.local.model.User

@Dao
abstract class UserDao: BaseDao<User>