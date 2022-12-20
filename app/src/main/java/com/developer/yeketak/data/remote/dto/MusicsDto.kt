package com.developer.yeketak.data.remote.dto

import com.google.gson.annotations.SerializedName


data class MusicsResponse(
    @SerializedName("data")
    val `data`: List<MusicDto>,
    @SerializedName("links")
    val links: Links,
    @SerializedName("meta")
    val meta: PaginationDto
)

data class MusicDto(
    @SerializedName("artist_name")
    val artistName: String,
    @SerializedName("download")
    val download: String,
    @SerializedName("downloaded")
    val downloaded: Int,
    @SerializedName("file")
    val `file`: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("like")
    val like: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("published")
    val published: Int,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("type")
    val type: String
)

data class Links(
    @SerializedName("first")
    val first: String,
    @SerializedName("last")
    val last: String,
    @SerializedName("next")
    val next: String?,
    @SerializedName("prev")
    val prev: String?
)