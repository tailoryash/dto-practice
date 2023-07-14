package com.simform.hibernate1.controller;

import com.simform.hibernate1.dto.bank.*;
import com.simform.hibernate1.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/bank")
public class BankController {
    @Autowired
    private BankService bankService;

    @PostMapping
    public ResponseEntity<BankResponseDto> create(@RequestBody BankRequestDto bankRequestDto){
        BankResponseDto bankResponseDto = bankService.create(bankRequestDto);
        return new ResponseEntity<>(bankResponseDto, HttpStatus.CREATED);
    }
}
