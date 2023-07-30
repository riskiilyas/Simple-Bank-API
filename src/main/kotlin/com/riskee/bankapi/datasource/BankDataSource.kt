package com.riskee.bankapi.datasource

import com.riskee.bankapi.model.Bank
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BankDataSource: JpaRepository<Bank, String> {
//    fun getBanks(): Collection<Bank>
//    fun getBankByAccountNumber(accountNumber: String): Bank
//    fun addBank(bank: Bank): Bank
}