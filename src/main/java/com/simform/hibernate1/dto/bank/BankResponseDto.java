package com.simform.hibernate1.dto.bank;

import com.simform.hibernate1.dto.account.*;
import com.simform.hibernate1.dto.customer.*;
import lombok.*;

import java.util.*;

@Data
public class BankResponseDto {
    private Long id;
    private String name;
    private List<AccountDto> accounts;
    private List<CustomerDto> customers;
}
