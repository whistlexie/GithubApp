package com.idisfkj.awesome.common

/**
 * Created by kotlon
 * Email : androidkotlon@gmail.com.
 */
sealed class ToPageStatus

object PageDefault : ToPageStatus()
object WelcomeToMain : ToPageStatus()
object WelcomeToLogin : ToPageStatus()
object LoginToMain : ToPageStatus()
object LoginToAuthorize: ToPageStatus()
object UserToRepos: ToPageStatus()
object UserToFollowers: ToPageStatus()
object UserToFollowing: ToPageStatus()
object ReposToWebView: ToPageStatus()
