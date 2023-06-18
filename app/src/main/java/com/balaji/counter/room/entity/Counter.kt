package com.balaji.counter.room.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "counter")
class Counter {

    @PrimaryKey(autoGenerate = true)
    var counterId: Int? = null

    var counterName: String = ""

    var initialCount: Int = 0

    var cycleLength: Int = 0

    var createdAt: String = ""

    var createdAtTimestamp: Long = 0

    var color: Int = 0
}
