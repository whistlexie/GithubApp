package com.idisfkj.awesome.followers

import com.alibaba.android.arouter.facade.annotation.Route
import com.idisfkj.awesome.basic.activity.BaseBindingActivity
import com.idisfkj.awesome.common.ARouterPaths
import com.idisfkj.awesome.followers.databinding.FollowersActivityFollowersLayoutBinding
import com.idisfkj.awesome.followers.vm.FollowersVM

/**
 * Created by kotlon 2019-11-21.
 * Email : androidkotlon@gmail.com.
 */
@Route(path = ARouterPaths.PATH_FOLLOWERS_FOLLOWERS)
class FollowersActivity : BaseBindingActivity<FollowersActivityFollowersLayoutBinding, FollowersVM>() {

    override fun getVariableId(): Int = BR.vm

    override fun getLayoutId(): Int = R.layout.followers_activity_followers_layout

    override fun getViewModelInstance(): FollowersVM = FollowersVM()

    override fun getViewModelClass(): Class<FollowersVM> = FollowersVM::class.java
}