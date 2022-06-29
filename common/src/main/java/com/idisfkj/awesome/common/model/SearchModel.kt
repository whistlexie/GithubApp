package com.idisfkj.awesome.common.model

/**
 * Created by kotlon 2019-12-02.
 * Email : androidkotlon@gmail.com.
 */
data class SearchModel(
    val total_count: Int,
    val incomplete_results: Boolean,
    val items: List<ReposModel>
)
