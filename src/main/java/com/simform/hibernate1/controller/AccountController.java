package com.simform.hibernate1.controller;

import com.simform.hibernate1.dto.account.*;
import com.simform.hibernate1.entity.*;
import com.simform.hibernate1.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping
    public ResponseEntity<AccountResponseDto> create(@RequestBody AccountRequestDto accountRequestDto) {
        AccountResponseDto accountResponseDto = accountService.create(accountRequestDto);
        return new ResponseEntity<>(accountResponseDto , HttpStatus.CREATED);
    }
}
