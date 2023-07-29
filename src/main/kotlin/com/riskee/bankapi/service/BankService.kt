package com.riskee.bankapi.service

import com.riskee.bankapi.datasource.BankDataSource
import org.springframework.stereotype.Service

@Service
class BankService(
    private val dataSource: BankDataSource
) {
    fun getBanks() = dataSource.getBanks()
}