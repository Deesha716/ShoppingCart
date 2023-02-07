package com.shoppingcart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingcart.entity.Customer;



public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}
