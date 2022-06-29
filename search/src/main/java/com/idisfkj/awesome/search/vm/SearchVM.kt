package com.idisfkj.awesome.search.vm

import android.os.Bundle
import androidx.appcompat.widget.SearchView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.idisfkj.awesome.basic.BaseScopeVM
import com.idisfkj.awesome.common.extensions.RequestCallback
import com.idisfkj.awesome.common.model.ResponseError
import com.idisfkj.awesome.common.model.ResponseSuccess
import com.idisfkj.awesome.common.model.SearchModel
import com.idisfkj.awesome.componentbridge.provider.BridgeProviders
import com.idisfkj.awesome.componentbridge.repos.ReposBridgeInterface
import com.idisfkj.awesome.network.HttpClient
import com.idisfkj.awesome.search.repository.SearchRepository

/**
 * Created by kotlon 2019-12-01.
 * Email: androidkotlon@gmail.com.
 */
class SearchVM : BaseScopeVM() {

    private val repository = SearchRepository(HttpClient.getService(), viewModelScope)
    private val mAdapter =
        BridgeProviders.instance.getBridge(ReposBridgeInterface::class.java).createReposAdapter()

    val clearFocus = MutableLiveData<Boolean>(true)

    override fun attach(savedInstanceState: Bundle?) {
        search("android-api-analysis")
    }

    private fun search(query: String?) {
        query?.let {
            showLoading.value = true
            repository.searchRepository(it, object : RequestCallback<SearchModel> {
                override fun onSuccess(result: ResponseSuccess<SearchModel>) {
                    showLoading.value = false
                    getAdapter().clear()
                    result.data?.let { searchModel ->
                        getAdapter().addData(searchModel.items)
                    }
                }

                override fun onError(error: ResponseError) {
                    showLoading.value = false
                }
            })
        }
    }

    fun getAdapter() = mAdapter

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
        search(query)
    }
}