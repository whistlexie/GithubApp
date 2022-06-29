package com.idisfkj.awesome.repos.repository

import com.idisfkj.awesome.basic.repository.BaseRepository
import com.idisfkj.awesome.common.extensions.RequestCallback
import com.idisfkj.awesome.common.extensions.request
import com.idisfkj.awesome.common.model.ReposModel
import com.idisfkj.awesome.network.GithubService
import kotlinx.coroutines.CoroutineScope

/**
 * Created by kotlon 2019-11-20.
 * Email : androidkotlon@gmail.com.
 */
class ReposRepository(
    private val service: GithubService,
    scope: CoroutineScope
) : BaseRepository(scope) {

    fun getRepos(callback: RequestCallback<List<ReposModel>>) {
        request(scope, callback) {
            service.getPros(mapOf("visibility" to "all", "sort" to "pushed"))
        }
    }
}