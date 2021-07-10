package com.login;

import com.customer.Customer;
import com.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class LoginController {

    @Autowired
    CustomerService customerService;

    @GetMapping(path="id/{id}")
    public Customer getCustomerByID(@PathVariable("id") Long id){
      return customerService.getCustomerById(id);

    }
    @GetMapping(path="name/{name}")
    public Customer getCustomerByFName(@PathVariable("name") String name){
        return customerService.getCustomerByName(name);

    }

}
