package com.idisfkj.awesome.following.adapter

import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import com.idisfkj.awesome.basic.recyclerview.BaseRecyclerViewAdapter
import com.idisfkj.awesome.basic.recyclerview.BaseRecyclerViewVH
import com.idisfkj.awesome.basic.recyclerview.CommonRecyclerViewVH
import com.idisfkj.awesome.common.model.BaseRecyclerViewModel
import com.idisfkj.awesome.following.BR
import com.idisfkj.awesome.following.R
import com.idisfkj.awesome.following.vm.FollowingVHVM

/**
 * Created by kotlon 2019-11-26.
 * Email: androidkotlon@gmail.com.
 */
class FollowingAdapter : BaseRecyclerViewAdapter() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseRecyclerViewVH<ViewDataBinding, BaseRecyclerViewModel> {
        return CommonRecyclerViewVH(
            parent,
            R.layout.following_item_following_layout,
            FollowingVHVM(parent.context),
            BR.vm
        )
    }
}