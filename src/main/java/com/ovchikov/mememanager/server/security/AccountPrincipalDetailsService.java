package com.ovchikov.mememanager.server.security;

import com.ovchikov.mememanager.server.db.AccountRepository;
import com.ovchikov.mememanager.server.model.Account;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AccountPrincipalDetailsService implements UserDetailsService {
    private AccountRepository accountRepository;

    public AccountPrincipalDetailsService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = this.accountRepository.findAccountByLogin(username);


        return new AccountPrincipal(account);
    }
}
