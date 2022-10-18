package com.ovchikov.mememanager.server.db;

import com.ovchikov.mememanager.server.model.Account;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class DBInit implements CommandLineRunner {
    private AccountRepository accountRepository;
    private PasswordEncoder passwordEncoder;

    public DBInit(AccountRepository accountRepository, PasswordEncoder passwordEncoder) {
        this.accountRepository = accountRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) throws Exception {

        if(!this.accountRepository.existsAccountByLogin("user1")){
            Account testAccount = new Account("user1", passwordEncoder.encode("user1"), "nikitos");
            this.accountRepository.save(testAccount);
        }

    }
}
