package com.appkomik.appkomik.data.remote

import com.appkomik.appkomik.data.model.MangaList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MangaService {
    @GET("/")
    fun listManga() : Call<MangaList>

    @GET("detail/")
    fun detailManga(@Query("url")url: String) : Call<MangaList>

    @GET("search/")
    fun searchManga(@Query("q")query: String) : Call<MangaList>
}