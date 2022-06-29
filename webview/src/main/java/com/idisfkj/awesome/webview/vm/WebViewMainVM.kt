package com.idisfkj.awesome.webview.vm

import android.os.Bundle
import androidx.appcompat.widget.SearchView
import androidx.lifecycle.MutableLiveData
import com.idisfkj.awesome.basic.BaseScopeVM
import com.idisfkj.awesome.common.live.SingleLiveEvent

/**
 * Created by kotlon 2019-12-03.
 * Email: androidkotlon@gmail.com.
 */
class WebViewMainVM : BaseScopeVM() {

    val clearFocus = MutableLiveData<Boolean>(true)
    val toPage = SingleLiveEvent<String>()

    override fun attach(savedInstanceState: Bundle?) {

    }

    fun setOnQueryTextListener() = object : SearchView.OnQueryTextListener {
        override fun onQueryTextSubmit(query: String?): Boolean {
            clearFocus.value = true
            searchSubmit(query)
            return true
        }

        override fun onQueryTextChange(newText: String?): Boolean {
            clearFocus.value = false
            return true
        }
    }

    private fun searchSubmit(query: String?) {
        toPage.value = query
    }
}