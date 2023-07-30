package com.riskee.bankapi.service

import com.riskee.bankapi.datasource.BankDataSource
import com.riskee.bankapi.model.Bank
import com.riskee.bankapi.model.ResponseModel
import org.springframework.stereotype.Service
import java.util.NoSuchElementException

@Service
class BankService(
    private val dataSource: BankDataSource
) {
    fun getBanks(): MutableList<Bank> {
        return dataSource.findAll()
    }
    fun getBankByAccountNumber(accountNumber: String): Bank {
        return dataSource.findById(accountNumber).orElseThrow{
            NoSuchElementException("Bank with Account number $accountNumber doesn't exist!")
        }
    }
    fun addBank(bank: Bank): Bank {
        return dataSource.save(bank)
    }

//    fun getBanks() = dataSource.getBanks()
//
//    fun getBankByAccountNumber(accountNumber: String) = dataSource.getBankByAccountNumber(accountNumber)
//    fun addBank(bank: Bank) = dataSource.addBank(bank)
}