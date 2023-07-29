package com.riskee.bankapi.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RootController {

    @GetMapping
    fun hello() = "<h1>Welcome to Bank API</h1>"
}