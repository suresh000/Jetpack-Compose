package com.balaji.counter.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.balaji.counter.room.ColumnInfoKeys

@Entity(tableName = "company")
data class Company (

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ColumnInfoKeys.KEY_COMPANY_ID)
    var companyId: Int? = null,

    @ColumnInfo(name = ColumnInfoKeys.KEY_COMPANY_LOGO)
    var companyLogo: String? = null,

    @ColumnInfo(name = ColumnInfoKeys.KEY_COMPANY_NAME)
    var companyName: String? = null,

    @ColumnInfo(name = ColumnInfoKeys.KEY_COMPANY_OWNER_NAME)
    var ownerName: String? = null,

    @ColumnInfo(name = ColumnInfoKeys.KEY_COMPANY_MOBILE_NUMBER)
    var mobileNumber: String? = null,

    @ColumnInfo(name = ColumnInfoKeys.KEY_COMPANY_FULL_ADDRESS)
    var fullAddress: String? = null,

    @ColumnInfo(name = ColumnInfoKeys.KEY_COMPANY_CATEGORY)
    var category: String? = null,

    @ColumnInfo(name = ColumnInfoKeys.KEY_COMPANY_TYPE)
    var type: String? = null,

    @ColumnInfo(name = ColumnInfoKeys.KEY_COMPANY_GST_NUMBER)
    var gstNumber: String? = null,

    @ColumnInfo(name = ColumnInfoKeys.KEY_COMPANY_ACCOUNT_HOLDER_NAME)
    var accountHolderName: String? = null,

    @ColumnInfo(name = ColumnInfoKeys.KEY_COMPANY_ACCOUNT_IFSC_CODE)
    var ifscCode: String? = null,

    @ColumnInfo(name = ColumnInfoKeys.KEY_COMPANY_ACCOUNT_NUMBER)
    var accountNumber: String? = null,

    @ColumnInfo(name = ColumnInfoKeys.KEY_COMPANY_FAVORITE)
    var favorite: Int = 0,

    @ColumnInfo(name = ColumnInfoKeys.KEY_COMPANY_COLOR_ONE)
    var colorOne: String? = null,

    @ColumnInfo(name = ColumnInfoKeys.KEY_COMPANY_COLOR_TWO)
    var colorTwo: String? = null,

    @ColumnInfo(name = ColumnInfoKeys.KEY_COMPANY_COLOR_TYPE)
    var colorType: Int = 0,

    @ColumnInfo(name = ColumnInfoKeys.KEY_CURRENT_COMPANY)
    var currentCompany: Int = 0,

    @ColumnInfo(name = ColumnInfoKeys.KEY_COMPANY_OWNER_SIGNATURE)
    var ownerSignature: String? = null,

    @ColumnInfo(name = ColumnInfoKeys.KEY_COMPANY_CURRENT_DATE_TIME)
    var currentDateTime: String? = null
)