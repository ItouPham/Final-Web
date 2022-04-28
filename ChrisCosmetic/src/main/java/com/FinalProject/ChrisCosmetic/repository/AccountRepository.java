package com.FinalProject.ChrisCosmetic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.FinalProject.ChrisCosmetic.entity.Account;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional
public interface AccountRepository extends JpaRepository<Account, String> {
    @Query("SELECT a FROM Account a WHERE a.email = :email")
    public Account findAccountByEmail(@Param("email") String email);

    Optional<Account> findByEmail(String email);
}
