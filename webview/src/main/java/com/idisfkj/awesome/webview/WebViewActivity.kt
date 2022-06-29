package com.idisfkj.awesome.webview

import android.os.Bundle
import androidx.lifecycle.Observer
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.idisfkj.awesome.basic.activity.BaseBindingActivity
import com.idisfkj.awesome.common.ARouterPaths
import com.idisfkj.awesome.webview.databinding.WebviewActivityWebviewBinding
import com.idisfkj.awesome.webview.vm.WebViewVM

/**
 * Created by kotlon 2019-12-03.
 * Email: androidkotlon@gmail.com.
 */
@Route(path = ARouterPaths.PATH_WEBVIEW_WEBVIEW)
class WebViewActivity : BaseBindingActivity<WebviewActivityWebviewBinding, WebViewVM>() {

    @Autowired
    lateinit var url: String
    @Autowired
    lateinit var requestUrl: String

    override fun getVariableId(): Int = BR.vm

    override fun getLayoutId(): Int = R.layout.webview_activity_webview

    override fun getViewModelInstance(): WebViewVM = WebViewVM()

    override fun getViewModelClass(): Class<WebViewVM> = WebViewVM::class.java

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ARouter.getInstance().inject(this)
        viewModel.url.value = url
        viewModel.request(requestUrl)
    }

    override fun addObserver() {
        super.addObserver()
        viewModel.backClick.observe(this, Observer {
            finish()
        })
    }

    override fun onBackPressed() {
        if (viewDataBinding.webView.canGoBack()) {
            viewDataBinding.webView.goBack()
            return
        }
        super.onBackPressed()
    }

}