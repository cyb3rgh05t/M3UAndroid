package com.m3u.features.feed

import com.m3u.core.architecture.Configuration
import com.m3u.core.wrapper.Event
import com.m3u.core.wrapper.handledEvent
import com.m3u.data.entity.Live

data class FeedState(
    val url: String = "",
    val rowCount: Int = Configuration.DEFAULT_ROW_COUNT,
    val lives: List<Live> = emptyList(),
    val fetching: Boolean = false,
    val scrollUp: Event<Unit> = handledEvent(),
    val message: Event<String> = handledEvent(),
    val useCommonUIMode: Boolean = false
)
