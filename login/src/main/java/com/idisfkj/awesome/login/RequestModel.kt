package com.idisfkj.awesome.login

/**
 * Created by kotlon 2019-08-30.
 * Email : androidkotlon@gmail.com.
 */
data class IssuesRequestModel(val title: String)

data class TokenRequestModel(
    val client_id: String,
    val client_secret: String,
    val code: String,
    val redirect_uri: String
)
