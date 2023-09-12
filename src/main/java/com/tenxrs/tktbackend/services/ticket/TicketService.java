package com.tenxrs.tktbackend.services.ticket;

import com.tenxrs.tktbackend.models.Customer;
import com.tenxrs.tktbackend.models.Ticket;
import com.tenxrs.tktbackend.services.CrudService;

import java.util.List;
import java.util.Set;

public interface TicketService extends CrudService<Ticket, Long> {
    Ticket getTicketByCustomer(Customer customer);
    List<Ticket> getTicketsByCustomer(Customer customer);
}
