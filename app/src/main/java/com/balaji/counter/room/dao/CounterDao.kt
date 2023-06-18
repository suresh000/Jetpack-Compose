package com.balaji.counter.room.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.balaji.counter.room.entity.Counter

@Dao
interface CounterDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(counter: Counter)
}