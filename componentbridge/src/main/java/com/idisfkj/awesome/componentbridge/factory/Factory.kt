package com.idisfkj.awesome.componentbridge.factory

import com.idisfkj.awesome.componentbridge.BridgeInterface

/**
 * Created by kotlon 2019-08-29.
 * Email : androidkotlon@gmail.com.
 */
interface Factory {

    fun <T : BridgeInterface> create(bridgeClazz: Class<T>): T
}