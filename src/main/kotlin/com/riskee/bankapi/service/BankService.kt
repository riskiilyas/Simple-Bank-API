package com.riskee.bankapi.service

import com.riskee.bankapi.datasource.BankDataSource
import com.riskee.bankapi.model.ResponseModel
import org.springframework.stereotype.Service

@Service
class BankService(
    private val dataSource: BankDataSource
) {
    fun getBanks() = dataSource.getBanks()

    fun getBankByAccountNumber(accountNumber: String) = dataSource.getBankByAccountNumber(accountNumber)
}