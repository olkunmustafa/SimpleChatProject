package com.zingat.simplechatproject

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Main module that can be used by all activities.
 * It should contains the common Classes like [android.content.Context]
 *
 * @since 1.0
 * @author Mustafa Olkun
 */
@Module
class AppModule(var mContext: Context) {

    @Singleton
    @Provides
    internal fun provideContext(): Context {
        return this.mContext
    }

}