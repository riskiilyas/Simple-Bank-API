package com.riskee.bankapi.model

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.jetbrains.annotations.NotNull

@Entity
@Table
data class Bank(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "account_number")
    @JsonProperty("account_number")
    val accountNumber: String,

    @Column(name = "trust")
    @JsonProperty("trust")
    val trust: Double,

    @Column(name = "default_transaction_fee")
    @JsonProperty("default_transaction_fee")
    val transactionFee: Int
) {
    constructor() : this("", 0.0, 0)
}