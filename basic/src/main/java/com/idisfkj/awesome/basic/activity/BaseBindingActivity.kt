package com.idisfkj.awesome.basic.activity

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.idisfkj.awesome.basic.BaseScopeVM
import com.idisfkj.awesome.common.utils.LoadingUtils

/**
 * Created by kotlon
 * Email : androidkotlon@gmail.com.
 */
abstract class BaseBindingActivity<V : ViewDataBinding, M : BaseScopeVM> : BaseActivity() {

    protected lateinit var viewDataBinding: V

    protected lateinit var viewModel: M


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewDataBinding = DataBindingUtil.setContentView(this, getLayoutId())
        viewModel = ViewModelProviders.of(this, object : ViewModelProvider.Factory {
            @Suppress("UNCHECKED_CAST")
            override fun <T : ViewModel> create(modelClass: Class<T>): T {
                return getViewModelInstance() as T
            }
        })[getViewModelClass()]
        viewDataBinding.setVariable(getVariableId(), viewModel)
        viewModel.attach(savedInstanceState)
        viewDataBinding.lifecycleOwner = this
        addObserver()
    }

    open fun addObserver() {
        viewModel.showLoading.observe(this, Observer {
            LoadingUtils.loading(it, viewDataBinding.root as? ViewGroup)
        })
    }

    abstract fun getVariableId(): Int

    @LayoutRes
    abstract fun getLayoutId(): Int

    abstract fun getViewModelInstance(): M

    abstract fun getViewModelClass(): Class<M>

}
