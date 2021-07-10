package com.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepo customerRepo;

    public void registerCustomer(Customer customer){
        customerRepo.save(customer);
    }


    public  Customer getCustomerById(Long id) {
        return customerRepo.findById(id).stream().findFirst().orElseThrow(IllegalArgumentException ::new);
    }

   public  Customer getCustomerByName(String fName){
      return  customerRepo.findByfName(fName).stream().findFirst().orElseThrow(IllegalArgumentException::new);
    }


}
