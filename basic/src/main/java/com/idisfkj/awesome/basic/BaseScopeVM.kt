package com.idisfkj.awesome.basic

import android.os.Bundle
import androidx.lifecycle.AndroidViewModel
import com.idisfkj.awesome.common.live.SingleLiveEvent
import com.idisfkj.awesome.common.utils.CommonUtils

/**
 * Created by kotlon
 * Email : androidkotlon@gmail.com.
 */
abstract class BaseScopeVM : AndroidViewModel(CommonUtils.getApp()) {

    val showLoading = SingleLiveEvent<Boolean>()

    abstract fun attach(savedInstanceState: Bundle? = null)

}
