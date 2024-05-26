package com.application.moviesapp.data.api.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MovieUpdateFavouriteDto(
    @SerialName("status_code")
    val statusCode: Int?,

    @SerialName("status_message")
    val statusMessage: String?,

    @SerialName("success")
    val success: Boolean?
)