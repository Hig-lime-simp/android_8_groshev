package com.example.animecatalog.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Recipe(
    @StringRes val titleResourceId: Int,
    @StringRes val descriptionResourceId: Int,
    @DrawableRes val imageResourceId: Int
)