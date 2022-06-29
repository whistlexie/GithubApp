package com.idisfkj.awesome.github.ui.main

import android.view.KeyEvent
import android.widget.Toast
import com.alibaba.android.arouter.facade.annotation.Route
import com.idisfkj.awesome.basic.activity.BaseBindingActivity
import com.idisfkj.awesome.common.ARouterPaths
import com.idisfkj.awesome.componentbridge.provider.BridgeProviders
import com.idisfkj.awesome.github.BR
import com.idisfkj.awesome.github.R
import com.idisfkj.awesome.github.databinding.ActivityMainBinding
import timber.log.Timber
import kotlin.system.exitProcess

/**
 * Created by kotlon
 * Email : androidkotlon@gmail.com.
 */
@Route(path = ARouterPaths.PATH_APP_MAIN)
class MainActivity : BaseBindingActivity<ActivityMainBinding, MainVM>() {

    override fun getVariableId(): Int = BR.vm

    override fun getLayoutId(): Int = R.layout.activity_main

    override fun getViewModelInstance(): MainVM = MainVM(supportFragmentManager)

    override fun getViewModelClass(): Class<MainVM> = MainVM::class.java

    override fun onKeyUp(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            return if (viewModel.exitApp()) {
                super.onKeyUp(keyCode, event)
            } else {
                Toast.makeText(
                    this,
                    getString(R.string.press_again_to_exit_app),
                    Toast.LENGTH_SHORT
                ).show()
                true
            }
        }
        return super.onKeyUp(keyCode, event)
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.d("$this: onDestroy")
        BridgeProviders.instance.clear()
        exitProcess(0)
    }

}