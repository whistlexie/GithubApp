package com.idisfkj.awesome.webview

import androidx.lifecycle.Observer
import com.idisfkj.awesome.basic.activity.BaseBindingActivity
import com.idisfkj.awesome.componentbridge.provider.BridgeProviders
import com.idisfkj.awesome.componentbridge.webview.WebViewBridgeInterface
import com.idisfkj.awesome.webview.databinding.WebviewActivityWebviewMainBinding
import com.idisfkj.awesome.webview.vm.WebViewMainVM

/**
 * Created by kotlon 2019-12-03.
 * Email: androidkotlon@gmail.com.
 */
class WebViewMainActivity : BaseBindingActivity<WebviewActivityWebviewMainBinding, WebViewMainVM>() {

    override fun getVariableId(): Int = BR.vm

    override fun getLayoutId(): Int = R.layout.webview_activity_webview_main

    override fun getViewModelInstance(): WebViewMainVM = WebViewMainVM()

    override fun getViewModelClass(): Class<WebViewMainVM> = WebViewMainVM::class.java

    override fun addObserver() {
        super.addObserver()
        viewModel.toPage.observe(this, Observer {
            BridgeProviders.instance.getBridge(WebViewBridgeInterface::class.java)
                .toWebViewActivity(this, it)
        })
    }
}