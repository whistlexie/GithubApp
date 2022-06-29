package com.idisfkj.awesome.login

sealed class LoginState
object LoginStateInit : LoginState()
object LoginSuccess : LoginState()
object LoginFailed : LoginState()