package com.simform.hibernate1.repository;

import com.simform.hibernate1.dto.account.*;
import com.simform.hibernate1.entity.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

}