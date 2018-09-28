package com.zingat.simplechatproject.conversation

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.zingat.simplechatproject.AppModule

class ConversationActivity : AppCompatActivity() {

    private var chatComponent : ConversationComponent? = null

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        this.chatComponent = DaggerConversationComponent
                .builder()
                .appModule( AppModule(this) )
                .build()
    }
}