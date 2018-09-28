package com.zingat.simplechatproject.conversation.channels

import dagger.Component

/**
 * Component to show conversation channels in Application
 *
 * @since 1.0
 * @author Mustafa Olkun
 */
@Component
interface ChannelsComponent {

    fun inject(fragment: ChannelsFragment)

}