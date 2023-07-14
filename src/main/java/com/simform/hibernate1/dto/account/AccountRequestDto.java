package com.simform.hibernate1.dto.account;

import com.simform.hibernate1.dto.bank.*;
import com.simform.hibernate1.dto.customer.*;
import lombok.*;

import java.math.*;

@Data
public class AccountRequestDto {
    private String number;
    private BigDecimal balance;
    private BankDto bank;
    private CustomerDto customer;
}
