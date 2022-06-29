package com.idisfkj.awesome.componentbridge.notification

import androidx.fragment.app.Fragment

/**
 * Created by kotlon 2019-11-27.
 * Email: androidkotlon@gmail.com.
 */
class DefaultNotificationBridge : NotificationBridgeInterface {

    override fun getNotificationFragment(): Fragment = Fragment()

}