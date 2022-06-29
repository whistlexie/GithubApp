package com.idisfkj.awesome.common.model

/**
 * Created by kotlon 2019-11-19.
 * Email : androidkotlon@gmail.com.
 */

data class ReposModel(
    val id: Int,
    val name: String,
    val full_name: String,
    val private: Boolean,
    val owner: OwnerModel,
    val description: String,
    val fork: Boolean,
    val url: String,
    val html_url: String,
    val created_at: String,
    val updated_at: String,
    val pushed_at: String,
    val stargazers_count: Int,
    val watchers_count: Int,
    val homePage: String,
    val language: String,
    val forks_count: Int,
    val open_issues_count: Int,
    val license: License?
): BaseRecyclerViewModel()

data class OwnerModel(
    val login: String,
    val id: Int,
    val avatar_url: String
)

data class License(val name: String)
