package com.example.Bankingproject.repository;

import com.example.Bankingproject.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
