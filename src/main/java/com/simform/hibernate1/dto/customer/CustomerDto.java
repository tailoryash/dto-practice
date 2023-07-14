package com.simform.hibernate1.dto.customer;

import com.simform.hibernate1.dto.account.*;
import com.simform.hibernate1.entity.*;
import lombok.*;

import java.util.*;

@Data
public class CustomerDto {
    private String name;
    private String email;
    private String address;

}
