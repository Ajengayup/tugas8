package com.appkomik.appkomik.data.model

data class MangaList(
    val status: Boolean = true,
    val message: String = "",
    val manga_list: List<Manga> = arrayListOf()
)
