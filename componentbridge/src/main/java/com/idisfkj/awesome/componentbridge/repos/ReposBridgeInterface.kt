package com.idisfkj.awesome.componentbridge.repos

import android.content.Context
import com.idisfkj.awesome.basic.recyclerview.BaseRecyclerViewAdapter
import com.idisfkj.awesome.componentbridge.BridgeInterface

/**
 * Created by kotlon 2019-11-19.
 * Email: androidkotlon@gmail.com.
 */
interface ReposBridgeInterface: BridgeInterface {

    fun toReposActivity(context: Context)

    fun createReposAdapter(): BaseRecyclerViewAdapter
}