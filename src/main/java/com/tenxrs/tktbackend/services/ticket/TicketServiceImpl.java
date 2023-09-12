package com.tenxrs.tktbackend.services.ticket;

import com.tenxrs.tktbackend.models.Customer;
import com.tenxrs.tktbackend.models.Ticket;
import com.tenxrs.tktbackend.repositories.TicketRepository;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class TicketServiceImpl implements TicketService {
    private final TicketRepository ticketRepository;

    public TicketServiceImpl(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public Ticket getTicketByCustomer(Customer customer) {
        return ticketRepository.findTicketByCustomer(customer);
    }

    @Override
    public ArrayList<Ticket> getTicketsByCustomer(Customer customer) {
        return new ArrayList<>(ticketRepository.findTicketsByCustomer(customer));
    }

    @Override
    public Ticket save(Ticket object) {
        return null;
    }

    @Override
    public Ticket findById(Long aLong) {
        return null;
    }

    @Override
    public void delete(Ticket object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
