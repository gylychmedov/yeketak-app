package com.developer.yeketak.peresentation.components.musics

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.developer.yeketak.data.remote.dto.MusicsResponse


@Composable
fun MusicList(musics: MusicsResponse) {

    Column() {
        Text(text = "Music list: ${musics.data.size}")
    }
}