package com.simform.hibernate1.entity;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Data
@Entity
@Table(name = "bank")
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bank_id", nullable = false)
    private Long id;

    @Column(name = "name", unique = true)
    private String name;

    @OneToMany(mappedBy = "bank", cascade = CascadeType.ALL)
    private List<Account> accounts = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "bank_customer",
            joinColumns = @JoinColumn(name = "bank_id"),
            inverseJoinColumns = @JoinColumn(name = "customer_id"))
    private List<Customer> customers = new ArrayList<>();

}