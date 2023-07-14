package com.simform.hibernate1.service;

import com.simform.hibernate1.dto.account.*;
import com.simform.hibernate1.entity.*;
import com.simform.hibernate1.mapstruct.*;
import com.simform.hibernate1.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private BankRepository bankRepository;

    @Autowired
    private MapStructMapper mapStructMapper;


    public AccountResponseDto create(AccountRequestDto accountRequestDto) {

        Account account = mapStructMapper.accountRequestDtoToAccount(accountRequestDto);
        Account saved = accountRepository.save(account);
        AccountResponseDto accountResponseDto = mapStructMapper.accountToAccountResponseDto(account);
        return accountResponseDto;
    }

    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    public Account findAccountDetailsByAccountNumber(String accountNumber) {
       return null;
    }

    public void deleteByAccountNumber(String accountNumber) {


    }

    public Account updateByAccountNumber(String accountNumber, Account account) {
       return null;
    }
}
