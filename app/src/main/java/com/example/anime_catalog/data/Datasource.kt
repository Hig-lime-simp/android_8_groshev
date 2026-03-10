package com.example.animecatalog.data

import com.example.anime_catalog.R
import com.example.animecatalog.model.Recipe

class Datasource {
    fun loadRecipeList(): List<Recipe> {
        return listOf(
            Recipe(R.string.recipe1, R.string.recipe1_description, R.drawable.recipe1),
            Recipe(R.string.recipe2, R.string.recipe2_description, R.drawable.recipe2),
            Recipe(R.string.recipe3, R.string.recipe3_description, R.drawable.recipe3),
            Recipe(R.string.recipe4, R.string.recipe4_description, R.drawable.recipe4),
            Recipe(R.string.recipe5, R.string.recipe5_description, R.drawable.recipe5),
            Recipe(R.string.recipe6, R.string.recipe6_description, R.drawable.recipe6),
            Recipe(R.string.recipe7, R.string.recipe7_description, R.drawable.recipe7),
            Recipe(R.string.recipe8, R.string.recipe8_description, R.drawable.recipe8),
            Recipe(R.string.recipe9, R.string.recipe9_description, R.drawable.recipe9),
            Recipe(R.string.recipe10, R.string.recipe10_description, R.drawable.recipe10)
        )
    }
}