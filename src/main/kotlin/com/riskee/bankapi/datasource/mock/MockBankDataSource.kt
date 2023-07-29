package com.riskee.bankapi.datasource.mock

import com.riskee.bankapi.datasource.BankDataSource
import com.riskee.bankapi.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource: BankDataSource {
    private val banks = listOf(
        Bank("1234", 1.0, 1),
        Bank("2345", 2.0, 14),
        Bank("3456", 3.0, 12)
    )

    override fun getBanks(): Collection<Bank> {
        return banks
    }
}