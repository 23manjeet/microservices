package com.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accounts.entity.Accounts;

public interface AccountsRepository extends JpaRepository<Accounts, Long>{

}
