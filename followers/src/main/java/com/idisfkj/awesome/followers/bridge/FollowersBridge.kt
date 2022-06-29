package com.idisfkj.awesome.followers.bridge

import android.content.Context
import com.alibaba.android.arouter.launcher.ARouter
import com.idisfkj.awesome.common.ARouterPaths
import com.idisfkj.awesome.componentbridge.followers.FollowersBridgeInterface

/**
 * Created by kotlon 2019-11-21.
 * Email : androidkotlon@gmail.com.
 */
class FollowersBridge : FollowersBridgeInterface {

    override fun toFollowersActivity(context: Context) {
        ARouter.getInstance().build(ARouterPaths.PATH_FOLLOWERS_FOLLOWERS).navigation(context)
    }
}