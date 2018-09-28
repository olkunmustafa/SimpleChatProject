package com.zingat.simplechatproject.conversation

import com.zingat.simplechatproject.AppModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface ConversationComponent {

    fun inject(activity: ConversationActivity)

}