package com.example.animecatalog.data

import com.example.anime_catalog.R
import com.example.animecatalog.model.Anime

class Datasource {
    fun loadAnimeList(): List<Anime> {
        return listOf(
            Anime(
                 R.string.anime1,
                 R.string.anime1_description,
                 R.drawable.anime1
            ),
            Anime(
                 R.string.anime2,
                 R.string.anime2_description,
                 R.drawable.anime2
            ),
            Anime(
                 R.string.anime3,
                 R.string.anime3_description,
                 R.drawable.anime3
            ),
            Anime(
                 R.string.anime4,
                 R.string.anime4_description,
                 R.drawable.anime4
            ),
            Anime(
                 R.string.anime5,
                 R.string.anime5_description,
                 R.drawable.anime5
            ),
            Anime(
                 R.string.anime6,
                 R.string.anime6_description,
                 R.drawable.anime6
            ),
            Anime(
                 R.string.anime7,
                 R.string.anime7_description,
                 R.drawable.anime7
            ),
            Anime(
                 R.string.anime8,
                 R.string.anime8_description,
                 R.drawable.anime8
            ),
            Anime(
                 R.string.anime9,
                 R.string.anime9_description,
                 R.drawable.anime9
            ),
            Anime(
                 R.string.anime10,
                 R.string.anime10_description,
                 R.drawable.anime10
            )

        )
    }
}