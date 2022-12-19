package com.developer.yeketak.data.remote.dto

import com.google.gson.annotations.SerializedName



data class PaginationDto(
    @SerializedName("current_page")
    val currentPage: Int,
    @SerializedName("from")
    val from: Int,
    @SerializedName("last_page")
    val lastPage: Int,
    @SerializedName("links")
    val links: List<Link>,
    @SerializedName("path")
    val path: String,
    @SerializedName("per_page")
    val perPage: Int,
    @SerializedName("to")
    val to: Int,
    @SerializedName("total")
    val total: Int
)

data class Link(
    @SerializedName("active")
    val active: Boolean,
    @SerializedName("label")
    val label: Int,
    @SerializedName("url")
    val url: String
)