package com.idisfkj.awesome.home.fragment.adapter

import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import com.idisfkj.awesome.basic.recyclerview.BasePagedListAdapter
import com.idisfkj.awesome.basic.recyclerview.BaseRecyclerViewVH
import com.idisfkj.awesome.common.model.BaseRecyclerViewModel
import com.idisfkj.awesome.common.model.UserModel
import com.idisfkj.awesome.home.R
import com.idisfkj.awesome.home.fragment.vh.HomeUserInfoVH
import com.idisfkj.awesome.home.fragment.vm.HomeUserInfoVM

/**
 * Created by kotlon 2019-09-02.
 * Email : androidkotlon@gmail.com.
 */
class HomePagedListAdapter(
    areItemsTheSame: (oldItem: UserModel, newItem: UserModel) -> Boolean = { oldItem, newItem -> oldItem == newItem },
    areContentsTheSame: (oldItem: UserModel, newItem: UserModel) -> Boolean = { oldItem, newItem -> oldItem.id == newItem.id }
) : BasePagedListAdapter<UserModel>(
    areItemsTheSame = areItemsTheSame,
    areContentsTheSame = areContentsTheSame
) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseRecyclerViewVH<ViewDataBinding, BaseRecyclerViewModel> {
        return HomeUserInfoVH(parent, R.layout.home_item_user_info_layout, HomeUserInfoVM())
    }

}
