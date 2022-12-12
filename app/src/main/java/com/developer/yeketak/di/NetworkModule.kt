package com.developer.yeketak.di

import com.developer.yeketak.data.remote.dao.RequestsDao
import com.developer.yeketak.peresentation.helpers.constants.Constants.HOME_URL
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Provides
    @Singleton
    fun provideGsonBuilder(): Gson {
        return GsonBuilder().setLenient().create()
    }


    @Singleton
    @Provides
    fun provideRetrofitBuilder(gson: Gson): Retrofit.Builder {
        return Retrofit.Builder()
            .baseUrl(HOME_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
    }

    @Singleton
    @Provides
    fun provideRequestsApi(retrofitBuilder: Retrofit.Builder): RequestsDao {
        return retrofitBuilder.build().create(RequestsDao::class.java)
    }

}