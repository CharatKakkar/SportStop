package com.login;

import com.customer.Customer;
import com.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("login")
public class LoginController {

    @Autowired
    CustomerService customerService;

    @GetMapping(params="id")
    public Customer getCustomerByID(@RequestParam Long id){
      return customerService.getCustomerById(id);

    }
    @GetMapping(params = "name")
    public Customer getCustomerByFName(@RequestParam String name){
        return customerService.getCustomerByName(name);

    }

}
