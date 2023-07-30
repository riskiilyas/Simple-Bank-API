//package com.riskee.bankapi.datasource.mock
//
//import com.riskee.bankapi.datasource.BankDataSource
//import com.riskee.bankapi.model.Bank
//import org.springframework.stereotype.Repository
//import java.util.NoSuchElementException
//
////@Repository
//class MockBankDataSource : BankDataSource {
//    private val banks = mutableListOf(
//        Bank("1234", 1.0, 1),
//        Bank("2345", 2.0, 14),
//        Bank("3456", 3.0, 12)
//    )
//
//    override fun getBankByAccountNumber(accountNumber: String): Bank {
//        val data = banks.filter {
//            it.accountNumber == accountNumber
//        }
//
//        if (data.isEmpty()) {
//            throw NoSuchElementException("Bank with Account number $accountNumber doesn't exist!")
//        }
//
//        return data[0]
//    }
//
//    override fun getBanks(): Collection<Bank> {
//        return banks
//    }
//
//    override fun addBank(bank: Bank): Bank {
//        if (banks.any { it.accountNumber == bank.accountNumber }) {
//            throw IllegalArgumentException("Bank With account number ${bank.accountNumber} already exist!")
//        }
//        banks.add(bank)
//        return bank
//    }
//}