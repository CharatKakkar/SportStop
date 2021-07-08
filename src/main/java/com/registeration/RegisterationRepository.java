package com.registeration;

import com.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterationRepository extends JpaRepository<Customer,Long> {

}
