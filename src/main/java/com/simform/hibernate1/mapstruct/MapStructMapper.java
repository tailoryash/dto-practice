package com.simform.hibernate1.mapstruct;

import com.simform.hibernate1.dto.account.*;
import com.simform.hibernate1.dto.bank.*;
import com.simform.hibernate1.dto.customer.*;
import com.simform.hibernate1.entity.*;
import org.mapstruct.*;

import java.util.*;

@Mapper(componentModel = "spring")
public interface MapStructMapper {

    Account accountRequestDtoToAccount(AccountRequestDto accountRequestDto);

//    AccountRequestDto accountDtoToAccountRequestDto(Account account);
//
    AccountResponseDto accountToAccountResponseDto(Account account);

    BankDto bankToBankDto(Bank bank);

    Bank bankDtoToBank(BankDto bankDto);

    Account accountDtoToAccount(AccountDto accountDto);

    AccountDto accountToAccountDto(Account account);

    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto customerDto);

    List<Account> listOfAccountDtoToListOfAccount(List<AccountDto> accountsDto);

    List<AccountDto> listOfAccountToListOfAccountDto(List<Account> accounts);

    Bank bankRequestToBank(BankRequestDto bankRequestDto);

    BankResponseDto bankTBankResponseDto(Bank bank);
}
