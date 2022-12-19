package com.developer.yeketak.data.local.mvvm.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.developer.yeketak.data.remote.dao.RequestsDao
import com.developer.yeketak.data.remote.dto.MusicsResponse
import com.developer.yeketak.data.remote.dto.SlidesDataDTO
import com.developer.yeketak.data.remote.dto.SlidesResponse
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class homeRepository @Inject constructor(
    private val requestApi: RequestsDao
) {
    var slidesList = MutableLiveData<List<SlidesDataDTO>>()
    var musicList = MutableLiveData<MusicsResponse>()

    init {
        slidesList = MutableLiveData()
        musicList = MutableLiveData()
    }

    fun getSlidesListLiveData(): MutableLiveData<List<SlidesDataDTO>> {
        return slidesList
    }

    fun getMusicListLiveData(): MutableLiveData<MusicsResponse> {
        return musicList
    }

    fun getSlides() {
        val job = CoroutineScope(Dispatchers.IO).launch {
            val response = requestApi.getSlidesList()
            withContext(Dispatchers.Main) {
                if (response.isSuccessful && response.body() != null) {
                    Log.e("retrofit", "Get slides success")
                    slidesList.value = response.body()!!.data
                } else {
                    Log.e("retrofit", "Get slides error")
                }
            }
        }
    }

    fun getMusics(page: Int) {
        val job = CoroutineScope(Dispatchers.IO).launch {
            val response = requestApi.getMusicList(page)
            withContext(Dispatchers.Main) {
                if (response.isSuccessful && response.body() != null) {
                    musicList.value = response.body()
                } else {
                    Log.e("retrofit", "Get music error $page")
                }
            }
        }
    }
}