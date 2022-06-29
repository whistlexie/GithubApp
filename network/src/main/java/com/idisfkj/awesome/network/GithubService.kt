package com.idisfkj.awesome.network

import com.google.gson.JsonObject
import com.idisfkj.awesome.common.model.*
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.*

/**
 * Created by kotlon 2019-08-30.
 * Email : androidkotlon@gmail.com.
 */
interface GithubService {

    @GET("/user")
    suspend fun getUser(): UserModel

    @GET("/users/{username}/repos")
    suspend fun getPros(@Path("username") username: String): Response<List<ReposModel>>

    @GET("/user/repos")
    suspend fun getPros(@QueryMap params: Map<String, String>): List<ReposModel>

    @POST("/{user}/repos")
    suspend fun createRepos(@Path("user") username: String, @Body params: JsonObject): Response<ReposModel>

    @POST("/repos/{user}/{repo}/issues")
    suspend fun createIssues(
        @Path("user") username: String,
        @Path("repo") repo: String,
        @Body params: JsonObject
    ): IssuesModel

    @POST("/login/oauth/access_token")
    suspend fun getAccessToken(@Body params: JsonObject): Response<ResponseBody>

    @GET("/user/followers")
    suspend fun getFollowers(): List<FollowersModel>

    @GET("/user/following")
    suspend fun getFollowing(): List<FollowersModel>

    @GET("/notifications")
    suspend fun getNotification(@QueryMap params: Map<String, String>): List<NotificationModel>

    @PATCH("/notifications/threads/{thread_id}")
    suspend fun markThreadRead(@Path("thread_id") threadId: String): Response<ResponseBody>

    @GET("/search/repositories")
    suspend fun searchRepository(@QueryMap params: Map<String, String>): SearchModel

    @GET("/{path}")
    suspend fun getNotificationRequestUrl(
        @Path(
            value = "path",
            encoded = true
        ) path: String
    ): NotificationRequestUrlModel

}