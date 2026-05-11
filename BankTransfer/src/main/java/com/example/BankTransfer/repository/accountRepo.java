package com.example.BankTransfer.repository;

import com.example.BankTransfer.entity.account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface accountRepo extends JpaRepository<account,Long> {
}
