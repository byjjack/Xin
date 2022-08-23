package com.example.mykt

import android.os.Handler

    fun postDelayed(delayMillis: Long, task: () -> Unit) {
        Handler().postDelayed(task, delayMillis)
    }
