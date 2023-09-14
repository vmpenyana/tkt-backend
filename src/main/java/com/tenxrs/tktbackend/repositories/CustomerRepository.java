package com.tenxrs.tktbackend.repositories;

import com.tenxrs.tktbackend.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
