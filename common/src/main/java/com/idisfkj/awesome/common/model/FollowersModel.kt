package com.idisfkj.awesome.common.model

/**
 * Created by kotlon 2019-11-22.
 * Email : androidkotlon@gmail.com.
 */
data class FollowersModel(
    val login: String,
    val avatar_url: String,
    val html_url: String
) : BaseRecyclerViewModel()