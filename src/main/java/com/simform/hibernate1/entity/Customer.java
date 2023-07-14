package com.simform.hibernate1.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Data
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email" , unique = true)
    private String email;

    @Column(name = "address")
    private String address;

    @OneToMany(mappedBy = "customer")
    private List<Account> accounts = new ArrayList<>();

    @ManyToMany
    private List<Bank> banks = new ArrayList<>();

}
