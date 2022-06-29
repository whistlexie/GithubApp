package com.idisfkj.awesome.notification.fragment

import com.idisfkj.awesome.basic.fragment.BaseFragment
import com.idisfkj.awesome.notification.BR
import com.idisfkj.awesome.notification.R
import com.idisfkj.awesome.notification.databinding.NotifyFragmentNotificationLayoutBinding
import com.idisfkj.awesome.notification.vm.NotificationVM

/**
 * Created by kotlon 2019-11-27.
 * Email: androidkotlon@gmail.com.
 */
class NotificationFragment :
    BaseFragment<NotifyFragmentNotificationLayoutBinding, NotificationVM>() {

    override fun getVariableId(): Int = BR.vm

    override fun getLayoutId(): Int = R.layout.notify_fragment_notification_layout

    override fun getViewModelInstance(): NotificationVM = NotificationVM(lifecycle)

    override fun getViewModelClass(): Class<NotificationVM> = NotificationVM::class.java

    companion object {
        fun getInstance(): NotificationFragment {
            return NotificationFragment()
        }
    }
}