package com.balaji.counter

import android.content.Context
import android.content.Intent
import com.balaji.counter.view.main.MainActivity

class AppNavigator {

    companion object {

        @JvmStatic
        fun navigateToMainActivity(context: Context, isPreviousClose: Boolean) {
            val intent = Intent(context, MainActivity::class.java)
            if (isPreviousClose) {
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
            }
            context.startActivity(intent)
        }
    }

}