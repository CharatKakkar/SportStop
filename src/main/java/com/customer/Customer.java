package com.customer;

import com.customAnnotations.Password.ValidatePassword;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@Data
@Entity
public class Customer {

    @Id
    @SequenceGenerator(sequenceName = "Id_sequence" , allocationSize = 1 , name = "Id_sequence")
    @GeneratedValue(generator = "Id_sequence" , strategy = GenerationType.SEQUENCE)
    Long id;

    public String getfName() {
        return fName;
    }

    @NotNull
    @Getter
    String fName,lName;
    @Email(message = "Email should be valid")
    @NotNull
    String email;
    @ValidatePassword
    String password;
    String address;
    Integer phoneNumber;

}
