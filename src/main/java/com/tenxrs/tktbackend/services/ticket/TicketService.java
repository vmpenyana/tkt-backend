package com.tenxrs.tktbackend.services.ticket;

import com.tenxrs.tktbackend.models.Customer;
import com.tenxrs.tktbackend.models.Ticket;

import java.util.List;
import java.util.Set;

public interface TicketService {
    Ticket getTicketByCustomer(Customer customer);
    List<Ticket> getTicketsByCustomer(Customer customer);
}
