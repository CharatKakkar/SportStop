package com.registeration;

import com.customer.Customer;
import com.customer.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("register")
public class RegisterCustomer {

    @Autowired
    CustomerRepo customerRepo;

    @GetMapping()
    public String returnRegisterPage(Model model){
        model.addAttribute("customer", new Customer());
        return "register";
    }

    @PostMapping()
    public String registerCustomer( @ModelAttribute("customer") @Valid Customer  customer , BindingResult bindingResult) {
        //registerService.
        if (bindingResult.hasErrors()) {
            return "register";

        }
        return "success";
    }

}