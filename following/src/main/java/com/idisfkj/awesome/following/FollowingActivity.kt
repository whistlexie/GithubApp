package com.idisfkj.awesome.following

import com.alibaba.android.arouter.facade.annotation.Route
import com.idisfkj.awesome.basic.activity.BaseBindingActivity
import com.idisfkj.awesome.common.ARouterPaths
import com.idisfkj.awesome.following.databinding.FollowingActivityFollowingLayoutBinding
import com.idisfkj.awesome.following.vm.FollowingVM

/**
 * Created by kotlon 2019-11-26.
 * Email: androidkotlon@gmail.com.
 */
@Route(path = ARouterPaths.PATH_FOLLOWING_FOLLOWING)
class FollowingActivity : BaseBindingActivity<FollowingActivityFollowingLayoutBinding, FollowingVM>() {

    override fun getVariableId(): Int = BR.vm

    override fun getLayoutId(): Int = R.layout.following_activity_following_layout

    override fun getViewModelInstance(): FollowingVM = FollowingVM()

    override fun getViewModelClass(): Class<FollowingVM> = FollowingVM::class.java
}