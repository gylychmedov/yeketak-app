package com.developer.yeketak.peresentation.components.slides

import androidx.compose.runtime.Composable
import coil.compose.AsyncImage
import com.developer.yeketak.data.remote.dto.SlidesDataDTO
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager

@OptIn(ExperimentalPagerApi::class)
@Composable
fun Slides(slides: List<SlidesDataDTO>?) {
    if (slides != null) {
        HorizontalPager(count = slides.size) { it ->
            AsyncImage(model = slides[it].image, contentDescription = "")
        }
    }
}