package com.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,String>{

    public List<Customer> findById(Long Id);
    public  List<Customer> findByfName(String fName);
   // public  List<Customer> FName2();
}
