package com.developer.yeketak.peresentation.components.musics

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.developer.yeketak.data.remote.dto.MusicsResponse


@Composable
fun MusicList(musics: MusicsResponse) {

    Column(
        modifier = Modifier.padding(10.dp),
        verticalArrangement = Arrangement.spacedBy(7.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = "Aýdymlar")
        }
        for (music in musics.data) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        color = MaterialTheme.colors.surface,
                        shape = RoundedCornerShape(10.dp)
                    )
                    .padding(5.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    AsyncImage(
                        model = music.image,
                        contentDescription = "music",
                        modifier = Modifier
                            .size(45.dp)
                            .clip(shape = RoundedCornerShape(8.dp))
                    )
                    Column() {
                        Text(text = music.name, fontSize = 13.sp)
                        Spacer(modifier = Modifier.height(1.dp))
                        Text(
                            text = if (music.artistName.length > 25) "${
                                music.artistName.substring(
                                    1,
                                    25
                                )
                            }..." else music.artistName,
                            color = MaterialTheme.colors.onSurface.copy(alpha = 0.5f),
                            fontSize = 12.sp
                        )
                    }
                }
//                IconButton(onClick = { /*TODO*/ }) {
//                    Icon(
//                        imageVector = Icons.Rounded.PlayArrow,
//                        modifier = Modifier.size(25.dp),
//                        contentDescription = "",
//                        tint = MaterialTheme.colors.primary
//                    )
//                }
            }

        }
    }
}