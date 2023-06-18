package com.balaji.counter.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room.databaseBuilder
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.balaji.counter.room.dao.CategoryDao
import com.balaji.counter.room.dao.CompanyDao
import com.balaji.counter.room.dao.CounterDao
import com.balaji.counter.room.dao.CounterEntryDao
import com.balaji.counter.room.entity.Category
import com.balaji.counter.room.entity.Company
import com.balaji.counter.room.entity.Counter
import com.balaji.counter.room.entity.CounterEntry

@Database(entities = [Company::class, Category::class,
    Counter::class, CounterEntry::class], version = 1)
@TypeConverters(value = [Converters::class, MapConverters::class])
abstract class AppRoomDatabase : RoomDatabase() {

    abstract fun companyDao(): CompanyDao
    abstract fun categoryDao(): CategoryDao
    abstract fun counterDao(): CounterDao
    abstract fun counterEntryDao(): CounterEntryDao

    companion object {

        private const val DB_NAME = "myCounter"

        private var INSTANCE: AppRoomDatabase? = null

        @JvmStatic
        fun getInstance(context: Context): AppRoomDatabase {
            if (INSTANCE == null) {
                synchronized(AppRoomDatabase::class.java) {
                    INSTANCE = databaseBuilder(
                        context.applicationContext,
                        AppRoomDatabase::class.java, DB_NAME
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                }
            }
            return INSTANCE!!
        }

        @JvmStatic
        fun destroyInstance() {
            INSTANCE = null
        }

        @JvmStatic
        fun refreshInstance(context: Context) {
            INSTANCE = null
            getInstance(context)
        }

    }
}