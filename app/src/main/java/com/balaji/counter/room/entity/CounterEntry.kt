package com.balaji.counter.room.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "counterEntry")
data class CounterEntry(

    @PrimaryKey(autoGenerate = true)
    val counterEntryId: Int? = null,

    val counterId: Int? = null,

    val date: String,

    val dateTimestamp: Long,

    val count: Int

)
