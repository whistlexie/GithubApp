package com.idisfkj.awesome.search.bridge

import androidx.fragment.app.Fragment
import com.idisfkj.awesome.componentbridge.search.SearchBridgeInterface
import com.idisfkj.awesome.search.fragment.SearchFragment

/**
 * Created by kotlon 2019-12-01.
 * Email: androidkotlon@gmail.com.
 */
class SearchBridge : SearchBridgeInterface {

    override fun getSearchFragment(): Fragment = SearchFragment.getInstance()

}