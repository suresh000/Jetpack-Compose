package com.balaji.counter.room.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.balaji.counter.room.entity.Company

@Dao
interface CompanyDao {

    @Insert
    fun insert(company: Company?)

    @get:Query("SELECT * FROM company")
    val companyList: LiveData<List<Company?>?>?

    @get:Query("SELECT * FROM company")
    val list: List<Company?>?

    @Query("SELECT * FROM company WHERE companyId = :companyId")
    fun getCompany(companyId: Int): Company?

    @get:Query("SELECT companyName FROM company")
    val companyNameList: List<String?>?

    @Delete
    fun delete(company: Company?)

    @Update
    fun update(company: Company?)

    @get:Query("SELECT COUNT(*) FROM `company`")
    val companyCount: Int

    @Query("UPDATE company SET currentCompany = :value WHERE companyId = :companyId")
    fun updateCurrentCompany(companyId: Int, value: Int)

    @Query("UPDATE company SET currentCompany = :value")
    fun removeCurrentCompany(value: Int)

    @Query("SELECT * FROM company WHERE currentCompany = :value")
    fun getCurrentCompany(value: Int): Company?

    @get:Query("SELECT * FROM company LIMIT 1")
    val firstRow: Company?
}