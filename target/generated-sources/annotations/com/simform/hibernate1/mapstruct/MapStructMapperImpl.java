package com.simform.hibernate1.mapstruct;

import com.simform.hibernate1.dto.account.AccountDto;
import com.simform.hibernate1.dto.account.AccountRequestDto;
import com.simform.hibernate1.dto.account.AccountResponseDto;
import com.simform.hibernate1.dto.bank.BankDto;
import com.simform.hibernate1.dto.bank.BankRequestDto;
import com.simform.hibernate1.dto.bank.BankResponseDto;
import com.simform.hibernate1.dto.customer.CustomerDto;
import com.simform.hibernate1.entity.Account;
import com.simform.hibernate1.entity.Bank;
import com.simform.hibernate1.entity.Customer;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-14T17:27:36+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 20 (Oracle Corporation)"
)
@Component
public class MapStructMapperImpl implements MapStructMapper {

    @Override
    public Account accountRequestDtoToAccount(AccountRequestDto accountRequestDto) {
        if ( accountRequestDto == null ) {
            return null;
        }

        Account account = new Account();

        account.setNumber( accountRequestDto.getNumber() );
        account.setBalance( accountRequestDto.getBalance() );
        account.setBank( bankDtoToBank( accountRequestDto.getBank() ) );
        account.setCustomer( customerDtoToCustomer( accountRequestDto.getCustomer() ) );

        return account;
    }

    @Override
    public AccountResponseDto accountToAccountResponseDto(Account account) {
        if ( account == null ) {
            return null;
        }

        AccountResponseDto accountResponseDto = new AccountResponseDto();

        accountResponseDto.setNumber( account.getNumber() );
        accountResponseDto.setBalance( account.getBalance() );
        accountResponseDto.setCustomer( customerToCustomerDto( account.getCustomer() ) );

        return accountResponseDto;
    }

    @Override
    public BankDto bankToBankDto(Bank bank) {
        if ( bank == null ) {
            return null;
        }

        BankDto bankDto = new BankDto();

        bankDto.setName( bank.getName() );

        return bankDto;
    }

    @Override
    public Bank bankDtoToBank(BankDto bankDto) {
        if ( bankDto == null ) {
            return null;
        }

        Bank bank = new Bank();

        bank.setName( bankDto.getName() );

        return bank;
    }

    @Override
    public Account accountDtoToAccount(AccountDto accountDto) {
        if ( accountDto == null ) {
            return null;
        }

        Account account = new Account();

        account.setNumber( accountDto.getNumber() );
        account.setBalance( accountDto.getBalance() );

        return account;
    }

    @Override
    public AccountDto accountToAccountDto(Account account) {
        if ( account == null ) {
            return null;
        }

        AccountDto accountDto = new AccountDto();

        accountDto.setNumber( account.getNumber() );
        accountDto.setBalance( account.getBalance() );

        return accountDto;
    }

    @Override
    public CustomerDto customerToCustomerDto(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerDto customerDto = new CustomerDto();

        customerDto.setName( customer.getName() );
        customerDto.setEmail( customer.getEmail() );
        customerDto.setAddress( customer.getAddress() );

        return customerDto;
    }

    @Override
    public Customer customerDtoToCustomer(CustomerDto customerDto) {
        if ( customerDto == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setName( customerDto.getName() );
        customer.setEmail( customerDto.getEmail() );
        customer.setAddress( customerDto.getAddress() );

        return customer;
    }

    @Override
    public List<Account> listOfAccountDtoToListOfAccount(List<AccountDto> accountsDto) {
        if ( accountsDto == null ) {
            return null;
        }

        List<Account> list = new ArrayList<Account>( accountsDto.size() );
        for ( AccountDto accountDto : accountsDto ) {
            list.add( accountDtoToAccount( accountDto ) );
        }

        return list;
    }

    @Override
    public List<AccountDto> listOfAccountToListOfAccountDto(List<Account> accounts) {
        if ( accounts == null ) {
            return null;
        }

        List<AccountDto> list = new ArrayList<AccountDto>( accounts.size() );
        for ( Account account : accounts ) {
            list.add( accountToAccountDto( account ) );
        }

        return list;
    }

    @Override
    public Bank bankRequestToBank(BankRequestDto bankRequestDto) {
        if ( bankRequestDto == null ) {
            return null;
        }

        Bank bank = new Bank();

        bank.setName( bankRequestDto.getName() );
        bank.setAccounts( listOfAccountDtoToListOfAccount( bankRequestDto.getAccounts() ) );
        bank.setCustomers( customerDtoListToCustomerList( bankRequestDto.getCustomers() ) );

        return bank;
    }

    @Override
    public BankResponseDto bankTBankResponseDto(Bank bank) {
        if ( bank == null ) {
            return null;
        }

        BankResponseDto bankResponseDto = new BankResponseDto();

        bankResponseDto.setId( bank.getId() );
        bankResponseDto.setName( bank.getName() );
        bankResponseDto.setAccounts( listOfAccountToListOfAccountDto( bank.getAccounts() ) );
        bankResponseDto.setCustomers( customerListToCustomerDtoList( bank.getCustomers() ) );

        return bankResponseDto;
    }

    protected List<Customer> customerDtoListToCustomerList(List<CustomerDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Customer> list1 = new ArrayList<Customer>( list.size() );
        for ( CustomerDto customerDto : list ) {
            list1.add( customerDtoToCustomer( customerDto ) );
        }

        return list1;
    }

    protected List<CustomerDto> customerListToCustomerDtoList(List<Customer> list) {
        if ( list == null ) {
            return null;
        }

        List<CustomerDto> list1 = new ArrayList<CustomerDto>( list.size() );
        for ( Customer customer : list ) {
            list1.add( customerToCustomerDto( customer ) );
        }

        return list1;
    }
}
