package com.example.BankTransfer.controller;

import com.example.BankTransfer.service.accountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class accountController {

    @Autowired
    private accountService service;

    @PostMapping("/transfer")
    public String transfer(@RequestParam Long from,
                           @RequestParam Long to,
                           @RequestParam double amount) {

        service.transfer(from, to, amount);
        return "Done";
    }
}