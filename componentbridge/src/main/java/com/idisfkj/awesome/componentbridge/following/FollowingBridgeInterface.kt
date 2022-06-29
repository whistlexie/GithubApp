package com.idisfkj.awesome.componentbridge.following

import android.content.Context
import com.idisfkj.awesome.componentbridge.BridgeInterface

/**
 * Created by kotlon 2019-11-26.
 * Email: androidkotlon@gmail.com.
 */
interface FollowingBridgeInterface : BridgeInterface {

    fun toFollowingActivity(context: Context)
}