package com.idisfkj.awesome.user

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.idisfkj.awesome.common.ARouterPaths
import com.idisfkj.awesome.user.fragment.UserFragment

/**
 * Created by kotlon 2019-11-15.
 * Email: androidkotlon@gmail.com.
 */
@Route(path = ARouterPaths.PATH_USER_MAIN)
class UserMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_activity_main)
        addFragment()
    }

    private fun addFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_layout, UserFragment.getInstance())
            .commit()
    }
}