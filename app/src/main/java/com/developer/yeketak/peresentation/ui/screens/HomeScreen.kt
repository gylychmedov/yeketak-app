package com.developer.yeketak.peresentation.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.hilt.navigation.compose.hiltViewModel
import com.developer.yeketak.data.local.mvvm.viewModel.slidesViewModel
import com.developer.yeketak.peresentation.components.slides.Slides

@Composable
fun HomeScreen(
    slidesViewModel: slidesViewModel = hiltViewModel()
) {
    val slidesList = slidesViewModel.slidesList.observeAsState()

    LaunchedEffect(key1 = true) {
        slidesViewModel.getSlides()
    }

    Column() {
        Slides(slides = slidesList.value)
    }
}