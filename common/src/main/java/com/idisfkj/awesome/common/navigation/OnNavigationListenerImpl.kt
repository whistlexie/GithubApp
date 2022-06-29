package com.idisfkj.awesome.common.navigation

import android.app.Activity
import android.content.Context

/**
 * Created by kotlon 2019-08-29.
 * Email : androidkotlon@gmail.com.
 */
class OnNavigationListenerImpl(private val context: Context) : OnNavigationListener {

    override fun onBackClick() {
        (context as? Activity)?.onBackPressed()
    }

    override fun onRightIconClick() {

    }
}
