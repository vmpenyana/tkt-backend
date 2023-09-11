package com.tenxrs.tktbackend.repositories;

import com.tenxrs.tktbackend.models.Customer;
import com.tenxrs.tktbackend.models.Ticket;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
    Ticket findTicketByCustomer(Customer customer);
    List<Ticket> findTicketsByCustomer(Customer customer);
}
