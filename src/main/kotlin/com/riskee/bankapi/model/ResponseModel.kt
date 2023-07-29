package com.riskee.bankapi.model

import com.fasterxml.jackson.annotation.JsonProperty

data class ResponseModel(
    @JsonProperty("status")
    val status: Int,
    @JsonProperty("message")
    val message: String,
    @JsonProperty("data")
    val data: Collection<Any>
)