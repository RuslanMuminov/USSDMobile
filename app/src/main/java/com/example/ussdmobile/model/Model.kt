package com.example.ussdmobile.model

import java.io.Serializable

data class Model(
    val name: String? = null,
    val month: String? = null,
    val sms: String? = null,
    val min: String? = null,
    val mb: String? = null):Serializable
