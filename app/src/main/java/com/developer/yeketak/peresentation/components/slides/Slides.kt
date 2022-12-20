package com.developer.yeketak.peresentation.components.slides

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.developer.yeketak.data.remote.dto.SlidesDataDTO
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager

@OptIn(ExperimentalPagerApi::class)
@Composable
fun Slides(slides: List<SlidesDataDTO>?) {
    if (slides != null) {
        HorizontalPager(
            count = slides.size,
            modifier = Modifier
                .padding(10.dp)
                .clip(shape = RoundedCornerShape(10.dp))
        ) { it ->
            AsyncImage(model = slides[it].image, contentDescription = "")
        }
    }
}