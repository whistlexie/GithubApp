package com.idisfkj.awesome.componentbridge.home

import androidx.fragment.app.Fragment
import com.idisfkj.awesome.componentbridge.BridgeInterface

/**
 * Created by kotlon 2019-09-02.
 * Email : androidkotlon@gmail.com.
 */
interface HomeBridgeInterface: BridgeInterface {

    fun getHomeFragment(): Fragment
}