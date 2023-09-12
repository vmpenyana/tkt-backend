package com.tenxrs.tktbackend.services.customer;

import com.tenxrs.tktbackend.models.Customer;
import com.tenxrs.tktbackend.services.CrudService;

public interface CustomerService extends CrudService<Customer, Long> {
    Customer findCustomerById(Long id);
}
