package com.m3u.features.main

import com.m3u.core.architecture.configuration.Configuration
import com.m3u.data.database.entity.Post
import com.m3u.features.main.model.FeedDetail

data class MainState(
    val loading: Boolean = false,
    val godMode: Boolean = Configuration.DEFAULT_GOD_MODE,
    val rowCount: Int = Configuration.DEFAULT_ROW_COUNT,
    val feeds: List<FeedDetail> = emptyList(),
    val posts: List<Post> = emptyList(),
    val post: Post? = null
)