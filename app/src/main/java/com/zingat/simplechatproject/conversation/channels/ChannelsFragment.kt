package com.zingat.simplechatproject.conversation.channels

import android.os.Bundle
import android.support.v4.app.Fragment
import com.zingat.simplechatproject.AppModule

class ChannelsFragment : Fragment() {

    private var channelsComponent : ChannelsComponent? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        this.daggerInit()
    }

    private fun daggerInit() {
//        this.channelsComponent = DaggerChannelsComponent
//                .builder()
//                .appModule(AppModule())

    }

}