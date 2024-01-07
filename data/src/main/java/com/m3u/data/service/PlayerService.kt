package com.m3u.data.service

import android.graphics.Rect
import androidx.media3.common.C
import androidx.media3.common.Format
import androidx.media3.common.PlaybackException
import androidx.media3.common.Player
import androidx.media3.common.TrackGroup
import androidx.media3.common.Tracks
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow

interface PlayerService {
    val player: Flow<Player?>
    
    val videoSize: StateFlow<Rect>
    val playbackState: StateFlow<@Player.State Int>
    val playerError: StateFlow<PlaybackException?>
    val groups: StateFlow<List<Tracks.Group>>
    val selected: StateFlow<Map<@C.TrackType Int, Format?>>

    val url: StateFlow<String?>

    fun play(url: String)
    fun stop()
    fun replay()
    fun chooseTrack(group: TrackGroup, trackIndex: Int)
}
