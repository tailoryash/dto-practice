package com.simform.hibernate1.dto.account;

import com.simform.hibernate1.dto.bank.*;
import com.simform.hibernate1.dto.customer.*;
import com.simform.hibernate1.entity.*;
import lombok.*;

import java.math.*;

@Data
public class AccountDto {
    private String number;

    private BigDecimal balance;
}
