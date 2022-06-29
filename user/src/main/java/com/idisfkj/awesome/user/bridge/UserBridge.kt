package com.idisfkj.awesome.user.bridge

import androidx.fragment.app.Fragment
import com.idisfkj.awesome.componentbridge.user.UserBridgeInterface
import com.idisfkj.awesome.user.fragment.UserFragment

/**
 * Created by kotlon 2019-11-15.
 * Email: androidkotlon@gmail.com.
 */
class UserBridge : UserBridgeInterface {

    override fun getUserFragment(): Fragment = UserFragment.getInstance()

}