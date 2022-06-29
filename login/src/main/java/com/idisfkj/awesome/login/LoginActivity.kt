package com.idisfkj.awesome.login

import android.content.Intent
import android.net.Uri
import android.text.TextUtils
import androidx.lifecycle.Observer
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.idisfkj.awesome.basic.activity.BaseActivity
import com.idisfkj.awesome.basic.activity.BaseBindingActivity
import com.idisfkj.awesome.common.*
import com.idisfkj.awesome.common.utils.showToast
import com.idisfkj.awesome.componentbridge.app.AppBridgeInterface
import com.idisfkj.awesome.componentbridge.provider.BridgeProviders
import com.idisfkj.awesome.login.databinding.LoginActivityLoginBinding


@Route(path = ARouterPaths.PATH_LOGIN_LOGIN)
class LoginActivity : BaseBindingActivity<LoginActivityLoginBinding, LoginVM>() {

    override fun getVariableId(): Int = BR.vm

    private var mAuthorizationCode: String? = null

    override fun getLayoutId(): Int = R.layout.login_activity_login

    override fun getViewModelInstance(): LoginVM =
        LoginVM(BridgeProviders.instance.getBridge(AppBridgeInterface::class.java))

    override fun getViewModelClass(): Class<LoginVM> = LoginVM::class.java

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        getExtra(intent)
    }

    private fun getExtra(intent: Intent?) {
        mAuthorizationCode = intent?.data?.getQueryParameter(Constants.AUTHORIZATION_CODE)
        if (!TextUtils.isEmpty(mAuthorizationCode)) {
            viewModel.getAccessTokenFromCode(mAuthorizationCode ?: "")
        }
    }

    override fun addObserver() {
        super.addObserver()
        viewModel.hideSoftInput.observe(this, Observer {
            if (it) hideSoftInput()
        })
        viewModel.toPage.observe(this, Observer {
            when (it) {
                is LoginToMain -> {
                    ARouter.getInstance().build(ARouterPaths.PATH_APP_MAIN).navigation(this)
                    finish()
                }
                is LoginToAuthorize -> authorize()
                PageDefault -> Any()
            }
        })
        viewModel.loginState.observe(this) {
            when (it) {
                LoginFailed -> {
                    showToast(getString(R.string.login_failed))
                }
                LoginSuccess -> {
                    hideSoftInput()
                }
            }
        }
    }

    private fun authorize() {
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(Constants.AUTHORIZATION_URL)))
    }
}
