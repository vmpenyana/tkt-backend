package com.tenxrs.tktbackend.controllers;

import com.tenxrs.tktbackend.models.Ticket;
import com.tenxrs.tktbackend.services.ticket.TicketService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TicketsController {
    private final TicketService ticketService;

    public TicketsController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping("/invalidate/{id}")
    boolean invalidateTicket(@PathVariable Long id) {
        Ticket ticket = ticketService.findById(id);
        if(ticket != null) {
            if(ticket.isValid()) {
                ticket.setValid(false);
                ticketService.save(ticket);
                log.info("ticket valid, admit!");
                return true;
            } else {
                log.info("ticket already used!");
                return false;
            }
        } else {
            log.info("ticket does not exist!");
            return false;
        }
    }
}
