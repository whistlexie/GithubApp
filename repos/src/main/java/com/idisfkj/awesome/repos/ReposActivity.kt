package com.idisfkj.awesome.repos

import com.alibaba.android.arouter.facade.annotation.Route
import com.idisfkj.awesome.basic.activity.BaseBindingActivity
import com.idisfkj.awesome.common.ARouterPaths
import com.idisfkj.awesome.repos.databinding.ReposActivityMainLayoutBinding
import com.idisfkj.awesome.repos.vm.ReposVM

/**
 * Created by kotlon 2019-11-19.
 * Email: androidkotlon@gmail.com.
 */
@Route(path = ARouterPaths.PATH_REPOS_REPOS)
class ReposActivity : BaseBindingActivity<ReposActivityMainLayoutBinding, ReposVM>() {

    override fun getVariableId(): Int = BR.vm

    override fun getLayoutId(): Int = R.layout.repos_activity_main_layout

    override fun getViewModelInstance(): ReposVM = ReposVM()

    override fun getViewModelClass(): Class<ReposVM> = ReposVM::class.java

}