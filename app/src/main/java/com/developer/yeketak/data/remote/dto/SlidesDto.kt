package com.developer.yeketak.data.remote.dto

import com.google.gson.annotations.SerializedName

data class SlidesResponse(
    @SerializedName("data")
    val `data`: List<SlidesDataDTO>
)


data class SlidesDataDTO(
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("link")
    val link: Any
)