package com.example.BankTransfer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.BankTransfer.entity.account;
import com.example.BankTransfer.repository.accountRepo;

@Service
public class accountService {

    @Autowired
    private accountRepo repo;

    @Transactional
    public void transfer(Long fromId, Long toId, double amount) {

        account from = repo.findById(fromId).orElseThrow();
        account to = repo.findById(toId).orElseThrow();

        // deduct
        from.setBalance(from.getBalance() - amount);
        repo.save(from);
// "Transaction failed : Output"
//        if (true) {
//            throw new RuntimeException("Transaction Failed!");
//        }

        if (false) {
            throw new RuntimeException("Transaction Failed!");
        }

        // add
        to.setBalance(to.getBalance() + amount);
        repo.save(to);
    }
}