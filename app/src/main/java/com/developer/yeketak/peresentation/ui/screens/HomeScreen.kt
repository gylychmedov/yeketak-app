package com.developer.yeketak.peresentation.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.developer.yeketak.data.local.mvvm.viewModel.homeViewModel
import com.developer.yeketak.peresentation.components.layout.Layout
import com.developer.yeketak.peresentation.components.musics.MusicList
import com.developer.yeketak.peresentation.components.slides.Slides

@Composable
fun HomeScreen(
    homeViewModel: homeViewModel = hiltViewModel()
) {
    val slidesList = homeViewModel.slidesList.observeAsState()
    val musicList = homeViewModel.musicList.observeAsState()

    LaunchedEffect(key1 = true) {
        homeViewModel.getSlides()
        homeViewModel.getMusics(1)
    }

    Layout {
        Column(
            modifier = Modifier.verticalScroll(rememberScrollState())
        ) {
            Slides(slides = slidesList.value)
            musicList.value?.let {
                MusicList(musics = musicList.value!!)
            }
        }
    }
}
