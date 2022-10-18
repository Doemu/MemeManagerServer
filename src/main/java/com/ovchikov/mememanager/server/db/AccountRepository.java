package com.ovchikov.mememanager.server.db;

import com.ovchikov.mememanager.server.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findAccountByLogin(String login);
    boolean existsAccountByLogin(String login);
}

