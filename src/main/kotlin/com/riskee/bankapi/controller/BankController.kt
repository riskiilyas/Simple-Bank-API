package com.riskee.bankapi.controller

import com.riskee.bankapi.model.Bank
import com.riskee.bankapi.model.ResponseModel
import com.riskee.bankapi.model.ResponseModelSingle
import com.riskee.bankapi.service.BankService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import java.util.NoSuchElementException

@RestController
@RequestMapping("api/banks")
class BankController(private val service: BankService) {
    @GetMapping
    fun getBanks(): ResponseModel<Bank> {
        return ResponseModel(200, "success", service.getBanks())
    }

    @GetMapping("/{accountNumber}")
    fun getBankByAccountNumber(@PathVariable accountNumber: String): ResponseModelSingle<Bank> {
        return ResponseModelSingle(200, "success", service.getBankByAccountNumber(accountNumber))
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun addBank(@RequestBody bank: Bank): ResponseModelSingle<Bank> {
        service.addBank(bank)
        return ResponseModelSingle(200, "success", bank)
    }

    @ExceptionHandler(IllegalArgumentException::class)
    fun handleBadRequest(e: IllegalArgumentException): ResponseEntity<ResponseModelSingle<Bank?>> {
        return ResponseEntity(
            ResponseModelSingle(HttpStatus.BAD_REQUEST.value(), e.message.toString(), null),
            HttpStatus.BAD_REQUEST
        )
    }

    @ExceptionHandler(NoSuchElementException::class)
    fun handleNotFound(e: NoSuchElementException): ResponseEntity<ResponseModelSingle<Bank?>> {
        return ResponseEntity(
            ResponseModelSingle(HttpStatus.NOT_FOUND.value(), e.message.toString(), null),
            HttpStatus.BAD_REQUEST
        )
    }
}