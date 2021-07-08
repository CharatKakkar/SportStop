package com.registeration;

import com.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    @Autowired
    RegisterationRepository registerationRepository;

    public void saveCustomer(Customer customer){
        registerationRepository.save(customer);
    }

    public  Customer findByid(Long Id){
      return  registerationRepository.findById(Id).get();
    }
}
