package com.idisfkj.awesome.common.utils

import android.content.Context
import android.widget.Toast

fun Context.showToast(content: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, content,duration).show()
}