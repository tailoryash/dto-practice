package com.simform.hibernate1.service;

import com.simform.hibernate1.dto.bank.*;
import com.simform.hibernate1.entity.*;
import com.simform.hibernate1.mapstruct.*;
import com.simform.hibernate1.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Service
public class BankService {
    @Autowired
    private BankRepository bankRepository;

    @Autowired
    private MapStructMapper mapStructMapper;

    public BankResponseDto create(BankRequestDto bankRequestDto) {
        Bank bank = mapStructMapper.bankRequestToBank(bankRequestDto);
        Bank saveBank = bankRepository.save(bank);
        BankResponseDto bankResponseDto = mapStructMapper.bankTBankResponseDto(saveBank);
        return bankResponseDto;
    }
}
