package com.idisfkj.awesome.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.idisfkj.awesome.common.ARouterPaths
import com.idisfkj.awesome.common.extensions.inflate
import com.idisfkj.awesome.login.databinding.LoginActivityMainBinding
import kotlinx.android.synthetic.main.login_activity_main.*

@Route(path = ARouterPaths.PATH_LOGIN_MAIN)
class MainActivity : AppCompatActivity() {
    private val mViewBinding = inflate<LoginActivityMainBinding>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewBinding.apply {
            login.setOnClickListener {
                ARouter.getInstance().build(ARouterPaths.PATH_LOGIN_LOGIN).navigation()
            }
        }
    }
}
