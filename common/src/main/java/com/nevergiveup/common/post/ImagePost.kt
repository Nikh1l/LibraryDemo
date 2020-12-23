package com.nevergiveup.common.post

import com.nevergiveup.common.shared.Location

data class ImagePost(

    val imageTitle: String,

    val imageDescription: String,

    val imageCapturedLocation: Location,

    val imageUrl: String
)