package com.balaji.counter.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.balaji.counter.room.ColumnInfoKeys

@Entity(tableName = "category")
data class Category (

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ColumnInfoKeys.KEY_CATEGORY_ID)
    var categoryId: Int = 0,

    @ColumnInfo(name = ColumnInfoKeys.KEY_CATEGORY_COMPANY_ID)
    var companyId: Int = 0,

    @ColumnInfo(name = ColumnInfoKeys.KEY_CATEGORY_NAME)
    var category: String? = null,

    @ColumnInfo(name = ColumnInfoKeys.KEY_CATEGORY_TYPE)
    var categoryType: Int = 0,

    @ColumnInfo(name = ColumnInfoKeys.KEY_CATEGORY_ICON_ID)
    var iconId: String? = null,

    @ColumnInfo(name = ColumnInfoKeys.KEY_CATEGORY_ICON)
    var icon: String? = null,

    @ColumnInfo(name = ColumnInfoKeys.KEY_CATEGORY_NOTE)
    var note: String? = null,

    @ColumnInfo(name = ColumnInfoKeys.KEY_CATEGORY_FAVORITE)
    var favorite: Int = 0,

    @ColumnInfo(name = ColumnInfoKeys.KEY_CATEGORY_EDITABLE)
    var isEditable: Int = 0,

    @ColumnInfo(name = ColumnInfoKeys.KEY_CATEGORY_COLOR_ONE)
    var colorOne: String? = null,

    @ColumnInfo(name = ColumnInfoKeys.KEY_CATEGORY_COLOR_TWO)
    var colorTwo: String? = null,

    @ColumnInfo(name = ColumnInfoKeys.KEY_CATEGORY_COLOR_TYPE)
    var colorType: Int = 0,

    @ColumnInfo(name = ColumnInfoKeys.KEY_CATEGORY_IN_TRASH)
    var inTrash: Int = 0,

    @ColumnInfo(name = ColumnInfoKeys.KEY_CATEGORY_IS_DEFAULT)
    var isDefault: Int = 0,

    @ColumnInfo(name = ColumnInfoKeys.KEY_CATEGORY_CURRENT_DATE_TIME)
    var currentDateTime: String? = null
)