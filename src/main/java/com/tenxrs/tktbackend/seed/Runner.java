package com.tenxrs.tktbackend.seed;

import com.tenxrs.tktbackend.models.*;
import com.tenxrs.tktbackend.services.bankingDetails.BankingDetailsService;
import com.tenxrs.tktbackend.services.customer.CustomerService;
import com.tenxrs.tktbackend.services.event.EventsService;
import com.tenxrs.tktbackend.services.organizer.OrganizersService;
import com.tenxrs.tktbackend.services.sale.SaleService;
import com.tenxrs.tktbackend.services.ticket.TicketService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Component
public class Runner implements CommandLineRunner {
    private final EventsService eventsService;
    private final OrganizersService organizersService;

    private final CustomerService customerService;

    private final TicketService ticketService;

    private final SaleService saleService;

    private final BankingDetailsService bankingDetailsService;
    public Runner(EventsService eventsService, OrganizersService organizersService, CustomerService customerService, TicketService ticketService, SaleService saleService, BankingDetailsService bankingDetailsService) {
        this.eventsService = eventsService;
        this.organizersService = organizersService;
        this.customerService = customerService;
        this.ticketService = ticketService;
        this.saleService = saleService;
        this.bankingDetailsService = bankingDetailsService;
    }

    @Override
    public void run(String... args) throws Exception {
        Event event = new Event();
        event.setDate(new Date());
        event.setProvince("Gauteng");
        event.setVenue("Finetown");

        Organizer organizer = new Organizer();
        organizer.setName("Nick");
        organizer.setCellNumber(718609225);
        organizer.setEmailAddress("nick@gmail.com");
        Set<Event> events = new HashSet<>();
        events.add(event);
        organizer.setEvents(events);

        event.setOrganizer(organizer);

        organizersService.save(organizer);

        Customer customer = new Customer();

        customer.setName("Vincent");
        customer.setCellNumber(718609225);
        customer.setEmailAddress("vincent@gmail.com");
        customer.setSurname("Mpenyana");

        Ticket ticket = new Ticket();
        ticket.setCustomer(customer);
        ticket.setEvent(event);
        ticket.setPrice(600.00);

        Set<Ticket> tickets = new HashSet<>();

        tickets.add(ticket);

        customer.setTickets(tickets);

        customerService.save(customer);

        // getting tickets owned by customer:
        Ticket owned = ticketService.getTicketByCustomer(customer);
        // for now, we need to use a break point to see this.
        ticketService.getTicketsByCustomer(customer);

        System.out.println(owned);

        BankingDetails bankingDetails = new BankingDetails();
        bankingDetails.setBank("Standard Bank");
        bankingDetails.setOrganizer(organizer); //todo: come back here.

        bankingDetails.setAccountHolder("tenxrs");
        bankingDetails.setAccountNumber(123456789);
        bankingDetails.setBranchCode(1212);

        organizer.setBankingDetails(bankingDetails);

        organizersService.save(organizer);

        Sale sale = new Sale();

        sale.setEvent(event);

        saleService.record(sale);



    }
}
