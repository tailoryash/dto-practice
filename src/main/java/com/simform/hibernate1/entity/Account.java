package com.simform.hibernate1.entity;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.*;

import java.math.*;

@Entity
@Data
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "account_number")
    private String number;

    @Column(name = "balance")
    private BigDecimal balance;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bank_id")
    private Bank bank;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "customer_id")
    private Customer customer;

}
