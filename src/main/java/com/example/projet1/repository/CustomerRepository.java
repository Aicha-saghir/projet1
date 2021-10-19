package com.example.projet1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projet1.domain.Customer;

@Repository 
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
