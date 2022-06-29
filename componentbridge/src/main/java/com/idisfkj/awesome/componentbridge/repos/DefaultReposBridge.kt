package com.idisfkj.awesome.componentbridge.repos

import android.content.Context
import android.widget.Toast
import com.idisfkj.awesome.basic.recyclerview.BaseRecyclerViewAdapter

/**
 * Created by kotlon 2019-11-19.
 * Email: androidkotlon@gmail.com.
 */
class DefaultReposBridge : ReposBridgeInterface {

    override fun createReposAdapter(): BaseRecyclerViewAdapter =
        object : BaseRecyclerViewAdapter() {}

    override fun toReposActivity(context: Context) {
        Toast.makeText(context, "toReposActivity", Toast.LENGTH_LONG).show()
    }
}