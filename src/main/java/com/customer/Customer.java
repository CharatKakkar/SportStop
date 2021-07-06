package com.customer;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@NoArgsConstructor
@Data
@Entity
public class Customer {

    Long id;
    String fName,lName,address;
    String email;
    Integer phoneNumber;

}
