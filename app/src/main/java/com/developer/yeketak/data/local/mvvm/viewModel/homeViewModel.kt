package com.developer.yeketak.data.local.mvvm.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.developer.yeketak.data.local.mvvm.repository.homeRepository
import com.developer.yeketak.data.remote.dto.MusicsResponse
import com.developer.yeketak.data.remote.dto.SlidesDataDTO
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class homeViewModel @Inject constructor(
    private val homeRepository: homeRepository
): ViewModel() {

    var slidesList = MutableLiveData<List<SlidesDataDTO>>()
    var musicList = MutableLiveData<MusicsResponse>()

    init {
        slidesList = homeRepository.getSlidesListLiveData()
        musicList = homeRepository.getMusicListLiveData()
    }

    fun getSlides() {
        homeRepository.getSlides()
    }

    fun getMusics(page: Int) {
        homeRepository.getMusics(page)
    }

}