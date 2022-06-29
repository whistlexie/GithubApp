package com.idisfkj.awesome.user

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter
import com.idisfkj.awesome.common.utils.SPUtils
import com.idisfkj.awesome.componentbridge.app.DefaultAppBridge
import com.idisfkj.awesome.componentbridge.followers.DefaultFollowersBridge
import com.idisfkj.awesome.componentbridge.following.DefaultFollowingBridge
import com.idisfkj.awesome.componentbridge.provider.BridgeProviders
import com.idisfkj.awesome.componentbridge.repos.DefaultReposBridge
import timber.log.Timber

/**
 * Created by kotlon 2019-11-15.
 * Email: androidkotlon@gmail.com.
 */
class UserApp : Application() {

    override fun onCreate() {
        super.onCreate()
        SPUtils.init(this)
        initTimber()
        initRouter()
        // register bridges
        BridgeProviders.instance
            .register(DefaultAppBridge::class.java)
            .register(DefaultReposBridge::class.java)
            .register(DefaultFollowersBridge::class.java)
            .register(DefaultFollowingBridge::class.java)
    }

    private fun initTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

    private fun initRouter() {
        if (BuildConfig.DEBUG) {
            ARouter.openLog()
            ARouter.openDebug()
        }
        ARouter.init(this)
    }
}