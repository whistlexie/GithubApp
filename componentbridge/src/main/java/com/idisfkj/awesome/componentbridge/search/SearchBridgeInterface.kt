package com.idisfkj.awesome.componentbridge.search

import androidx.fragment.app.Fragment
import com.idisfkj.awesome.componentbridge.BridgeInterface

/**
 * Created by kotlon 2019-12-01.
 * Email: androidkotlon@gmail.com.
 */
interface SearchBridgeInterface : BridgeInterface {

    fun getSearchFragment(): Fragment
}