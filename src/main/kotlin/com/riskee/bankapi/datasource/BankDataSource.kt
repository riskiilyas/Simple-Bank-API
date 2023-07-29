package com.riskee.bankapi.datasource

import com.riskee.bankapi.model.Bank

interface BankDataSource {
    fun getBanks(): Collection<Bank>
}