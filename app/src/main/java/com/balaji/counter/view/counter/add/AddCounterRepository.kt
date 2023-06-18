package com.balaji.counter.view.counter.add

import android.content.Context
import android.text.TextUtils
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.navigation.NavController
import com.balaji.counter.room.AppRoomDatabase
import com.balaji.counter.room.entity.Counter
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AddCounterRepository(private val mContext: Context) {

    val counterName: MutableState<String> = mutableStateOf("")
    val initialCount: MutableState<String> = mutableStateOf("")
    val cycleLength: MutableState<String> = mutableStateOf("")

    fun insert(navController: NavController) {
        CoroutineScope(Dispatchers.IO).launch {
            val counter = Counter()
            counter.counterName = counterName.value
            if (!TextUtils.isEmpty(initialCount.value)) {
                counter.initialCount = initialCount.value.toInt()
            } else {
                counter.initialCount = 0
            }
            if (!TextUtils.isEmpty(cycleLength.value)) {
                counter.cycleLength = cycleLength.value.toInt()
            } else {
                counter.cycleLength = 108
            }
            counter.createdAt = ""
            counter.createdAtTimestamp = 0L
            counter.color = 0

            AppRoomDatabase.getInstance(mContext).counterDao().insert(counter)

            navController.navigateUp()
        }
    }

}