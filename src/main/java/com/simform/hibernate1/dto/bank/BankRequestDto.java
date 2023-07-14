package com.simform.hibernate1.dto.bank;

import com.simform.hibernate1.dto.account.*;
import com.simform.hibernate1.dto.customer.*;
import com.simform.hibernate1.entity.*;
import lombok.*;

import java.util.*;

@Data
public class BankRequestDto {
    private String name;
    private List<AccountDto> accounts;
    private List<CustomerDto> customers;
}
