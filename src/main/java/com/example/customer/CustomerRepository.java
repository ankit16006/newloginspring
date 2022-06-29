package com.example.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository
@Component
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
