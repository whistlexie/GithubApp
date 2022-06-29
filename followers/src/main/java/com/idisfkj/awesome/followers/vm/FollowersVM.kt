package com.idisfkj.awesome.followers.vm

import android.os.Bundle
import androidx.lifecycle.viewModelScope
import com.idisfkj.awesome.basic.BaseScopeVM
import com.idisfkj.awesome.common.extensions.RequestCallback
import com.idisfkj.awesome.common.live.SingleLiveEvent
import com.idisfkj.awesome.common.model.FollowersModel
import com.idisfkj.awesome.common.model.ResponseError
import com.idisfkj.awesome.common.model.ResponseSuccess
import com.idisfkj.awesome.followers.adapter.FollowersAdapter
import com.idisfkj.awesome.followers.repository.FollowersRepository
import com.idisfkj.awesome.network.HttpClient

/**
 * Created by kotlon 2019-11-21.
 * Email : androidkotlon@gmail.com.
 */
class FollowersVM : BaseScopeVM() {

    private val repository = FollowersRepository(HttpClient.getService(), viewModelScope)
    val adapter = FollowersAdapter()
    val isRefreshing = SingleLiveEvent<Boolean>()

    override fun attach(savedInstanceState: Bundle?) {
        getFollowers(false)
    }

    private fun getFollowers(refresh: Boolean) {
        if (!refresh) showLoading.value = true
        repository.getFollowers(object : RequestCallback<List<FollowersModel>> {
            override fun onSuccess(result: ResponseSuccess<List<FollowersModel>>) {
                isRefreshing.value = false
                showLoading.value = false
                if (refresh) {
                    adapter.clear()
                    adapter.notifyDataSetChanged()
                }
                result.data?.let { adapter.addData(it) }
            }

            override fun onError(error: ResponseError) {
                showLoading.value = false
                isRefreshing.value = false
            }
        })
    }

    fun onRefreshListener() {
        isRefreshing.value = true
        getFollowers(true)
    }
}