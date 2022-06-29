package com.idisfkj.awesome.componentbridge.notification

import androidx.fragment.app.Fragment
import com.idisfkj.awesome.componentbridge.BridgeInterface

/**
 * Created by kotlon 2019-11-27.
 * Email: androidkotlon@gmail.com.
 */
interface NotificationBridgeInterface : BridgeInterface {

    fun getNotificationFragment(): Fragment
}