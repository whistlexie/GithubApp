package com.idisfkj.awesome.componentbridge.following

import android.content.Context
import android.widget.Toast

/**
 * Created by kotlon 2019-11-26.
 * Email: androidkotlon@gmail.com.
 */
class DefaultFollowingBridge : FollowingBridgeInterface {

    override fun toFollowingActivity(context: Context) {
        Toast.makeText(context, "toFollowingActivity", Toast.LENGTH_LONG).show()
    }
}