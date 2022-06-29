package com.idisfkj.awesome.github.ui.welcome

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.idisfkj.awesome.basic.BaseScopeVM
import com.idisfkj.awesome.common.PageDefault
import com.idisfkj.awesome.common.ToPageStatus
import com.idisfkj.awesome.common.WelcomeToLogin
import com.idisfkj.awesome.common.WelcomeToMain
import com.idisfkj.awesome.common.utils.CommonUtils
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * Created by kotlon
 */
class WelcomeVM : BaseScopeVM() {

    val toPage = MutableLiveData<ToPageStatus>(PageDefault)

    override fun attach(savedInstanceState: Bundle?) {
        viewModelScope.launch {
            delay(1500)
            toPage.postValue(if (CommonUtils.hasLogin()) WelcomeToMain else WelcomeToLogin)
        }
    }
}