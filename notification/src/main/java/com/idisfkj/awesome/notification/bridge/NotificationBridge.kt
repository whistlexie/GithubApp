package com.idisfkj.awesome.notification.bridge

import androidx.fragment.app.Fragment
import com.idisfkj.awesome.componentbridge.notification.NotificationBridgeInterface
import com.idisfkj.awesome.notification.fragment.NotificationFragment

/**
 * Created by kotlon 2019-11-27.
 * Email: androidkotlon@gmail.com.
 */
class NotificationBridge : NotificationBridgeInterface {

    override fun getNotificationFragment(): Fragment = NotificationFragment.getInstance()
}