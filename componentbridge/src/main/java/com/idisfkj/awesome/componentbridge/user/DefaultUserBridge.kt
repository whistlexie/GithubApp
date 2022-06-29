package com.idisfkj.awesome.componentbridge.user

import androidx.fragment.app.Fragment

/**
 * Created by kotlon 2019-11-15.
 * Email: androidkotlon@gmail.com.
 */
class DefaultUserBridge : UserBridgeInterface{

    override fun getUserFragment(): Fragment = Fragment()
}