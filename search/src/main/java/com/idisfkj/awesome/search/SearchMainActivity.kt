package com.idisfkj.awesome.search

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.idisfkj.awesome.common.ARouterPaths
import com.idisfkj.awesome.search.fragment.SearchFragment
import timber.log.Timber

/**
 * Created by kotlon 2019-12-01.
 * Email: androidkotlon@gmail.com.
 */
@Route(path = ARouterPaths.PATH_SEARCH_MAIN)
class SearchMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Timber.d("========== onCreate ===========")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search_activity_main_layout)
        addFragment()
    }

    private fun addFragment() {
        Timber.d("========== addFragment ===========")
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_layout, SearchFragment.getInstance())
            .commit()
    }
}