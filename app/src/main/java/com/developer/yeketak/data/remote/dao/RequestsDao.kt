package com.developer.yeketak.data.remote.dao

import com.developer.yeketak.data.remote.dto.MusicsResponse
import com.developer.yeketak.data.remote.dto.SlidesResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface RequestsDao {

    //    Files
    @GET("front/files/mp4")
    fun getVideoList(@Query("page") page: Int): Call<String>

    @GET("front/files/mp3")
    suspend fun getMusicList(@Query("page") page: Int): Response<MusicsResponse>

    @GET("front/file/{slug}")
    fun getMusicList(@Path("slug") slug: String): Call<String>


    //    Banners
    @GET("front/slides")
    suspend fun getSlidesList(): Response<SlidesResponse>


    //    Top list
    @GET("front/favorites")
    fun getFavoriteList(): Call<String>

    @GET("front/most_popular")
    fun getPopularDownloadedList(): Call<String>


    //    Artist
    @GET("front/artists")
    fun getArtistList(): Call<String>

    @GET("front/artist/{slug}")
    fun getArtistDetail(@Path("slug") slug: String): Call<String>


    //    Markets
    @GET("front/markets")
    fun getMarketList(): Call<String>

    @GET("front/market/{slug}/products")
    fun getMarketDetail(@Path("slug") slug: String, @Query("page") page: Int): Call<String>

    @GET("front/market/{slug}/image")
    fun getMarketProductList(@Path("slug") slug: String): Call<String>


    //    Services
    @GET("front/services")
    fun getServiceList(): Call<String>

    @GET("front/service/{slug}/products")
    fun getServiceDetail(@Path("slug") slug: String): Call<String>

    @GET("front/service/{slug}/image")
    fun getServiceProductList(@Path("slug") slug: String): Call<String>
}

