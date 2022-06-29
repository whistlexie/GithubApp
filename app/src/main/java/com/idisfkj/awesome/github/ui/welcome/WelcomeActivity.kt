package com.idisfkj.awesome.github.ui.welcome

import android.view.KeyEvent
import androidx.lifecycle.Observer
import com.alibaba.android.arouter.launcher.ARouter
import com.idisfkj.awesome.basic.activity.BaseBindingActivity
import com.idisfkj.awesome.common.ARouterPaths
import com.idisfkj.awesome.common.PageDefault
import com.idisfkj.awesome.common.WelcomeToLogin
import com.idisfkj.awesome.common.WelcomeToMain
import com.idisfkj.awesome.github.BR
import com.idisfkj.awesome.github.R
import com.idisfkj.awesome.github.databinding.ActivityWelcomeBinding

/**
 * Created by kotlon
 */
class WelcomeActivity : BaseBindingActivity<ActivityWelcomeBinding, WelcomeVM>() {

    override fun getVariableId(): Int = BR.vm

    override fun getLayoutId(): Int = R.layout.activity_welcome

    override fun getViewModelInstance(): WelcomeVM = WelcomeVM()

    override fun getViewModelClass(): Class<WelcomeVM> = WelcomeVM::class.java

    override fun onKeyUp(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            return true
        }
        return super.onKeyUp(keyCode, event)
    }

    override fun addObserver() {
        super.addObserver()
        viewModel.toPage.observe(this, Observer {
            when (it) {
                is WelcomeToMain -> {
                    ARouter.getInstance().build(ARouterPaths.PATH_APP_MAIN).navigation(this)
                    finish()
                }
                is WelcomeToLogin -> {
                    ARouter.getInstance().build(ARouterPaths.PATH_LOGIN_LOGIN).navigation(this)
                    finish()
                }
                PageDefault -> Any()
            }
        })
    }
}