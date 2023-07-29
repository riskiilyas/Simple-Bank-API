package com.riskee.bankapi.controller

import com.riskee.bankapi.model.ResponseModel
import com.riskee.bankapi.service.BankService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/banks")
class BankController(private val service: BankService) {
    @GetMapping
    fun getBanks() = ResponseModel(200, "success", service.getBanks())

    @GetMapping("/{accountNumber}")
    fun getBankByAccountNumber(@PathVariable accountNumber: String) =
        ResponseModel(200, "success", service.getBankByAccountNumber(accountNumber))
}