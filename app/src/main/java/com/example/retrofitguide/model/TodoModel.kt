package com.example.retrofitguide.model

import com.google.gson.annotations.SerializedName

data class TodoModel(
    @SerializedName("completed")
    val status: Boolean,

    val id: Int,
    val title: String,
    val userId: Int
)