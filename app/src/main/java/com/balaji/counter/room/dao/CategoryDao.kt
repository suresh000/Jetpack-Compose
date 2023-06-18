package com.balaji.counter.room.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.balaji.counter.room.entity.Category

@Dao
interface CategoryDao {

    @Insert
    suspend fun insert(category: Category)

    @Query("SELECT * FROM category")
    fun categoryList(): LiveData<List<Category>>

    @Query("SELECT * FROM category WHERE categoryCompanyId = :companyId")
    fun categoryList(companyId: Int): LiveData<List<Category>>

    @Query("SELECT * FROM category WHERE categoryCompanyId = :companyId AND categoryType = :isExpenseIncome")
    fun categoryList(companyId: Int, isExpenseIncome: Int): LiveData<List<Category>>

    @Query("SELECT * FROM category")
    fun list(): List<Category>

    @Query("SELECT * FROM category WHERE categoryType = :isExpenseIncome")
    fun list(isExpenseIncome: Int): List<Category>

    @Query("SELECT * FROM category WHERE categoryId = :categoryId")
    fun getCategory(categoryId: Int): Category

    @Query("SELECT * FROM category WHERE categoryCompanyId = :companyId AND categoryId = :categoryId")
    fun getCategory(companyId: Int, categoryId: Int): Category

    @Query("SELECT * FROM category WHERE categoryCompanyId = :companyId AND categoryType = :categoryType AND categoryIsDefault = :isDefault")
    fun getCategoryDefault(companyId: Int, categoryType: Int, isDefault: Int): Category

    @Query("SELECT categoryName FROM category")
    fun categoryNameList(): List<String>

    @Delete
    suspend fun delete(category: Category)

    @Update
    suspend fun update(category: Category)

    @Query("SELECT COUNT(*) FROM category")
    suspend fun getCategoryCount(): Int

    @Query("SELECT COUNT(*) FROM category WHERE categoryCompanyId = :companyId")
    suspend fun getCategoryCount(companyId: Int): Int
}