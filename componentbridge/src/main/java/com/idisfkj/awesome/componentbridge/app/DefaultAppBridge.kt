package com.idisfkj.awesome.componentbridge.app

import com.idisfkj.awesome.componentbridge.BuildConfig

/**
 * app bridge default implement
 * Created by kotlon 2019-09-02.
 * Email : androidkotlon@gmail.com.
 */
class DefaultAppBridge : AppBridgeInterface {

    override fun getAuthorizationBasic(): String? = BuildConfig.AUTHORIZATION_BASIC

    override fun setAuthorizationBasic(authorization: String?) {

    }

    override fun getAccessToken(): String? = BuildConfig.ACCESS_TOKEN

    override fun setAccessToken(accessToken: String?) {

    }
}