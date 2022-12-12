package com.developer.yeketak.data.local.mvvm.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.developer.yeketak.data.remote.dao.RequestsDao
import com.developer.yeketak.data.remote.dto.SlidesDataDTO
import com.developer.yeketak.data.remote.dto.SlidesResponse
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class slidesRepository @Inject constructor(
    private val requestApi: RequestsDao
) {
    var slidesList = MutableLiveData<List<SlidesDataDTO>>()

    init {
        slidesList = MutableLiveData()
    }

    fun getSlidesListLiveData(): MutableLiveData<List<SlidesDataDTO>> {
        return slidesList
    }

    fun getSlides() {
        requestApi.getSlidesList().enqueue(object : Callback<SlidesResponse> {
            override fun onResponse(
                call: Call<SlidesResponse>,
                response: Response<SlidesResponse>
            ) {
                CoroutineScope(Dispatchers.Main).launch {
                    Log.e("slides", "Slides response: ${response.body().toString()}")
                    if (response.isSuccessful && response.body() != null) {
                        slidesList.value = response.body()!!.data
                    }
                }
            }

            override fun onFailure(call: Call<SlidesResponse>, t: Throwable) {
            }
        })
    }
}