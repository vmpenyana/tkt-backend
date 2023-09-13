package com.tenxrs.tktbackend.controllers;

import com.tenxrs.tktbackend.models.BankingDetails;
import com.tenxrs.tktbackend.models.Event;
import com.tenxrs.tktbackend.models.Organizer;
import com.tenxrs.tktbackend.services.organizer.OrganizersService;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


@RestController
public class OrganizersController {

    private final OrganizersService organizersService;

    public OrganizersController(OrganizersService organizersService) {
        this.organizersService = organizersService;
    }

    @GetMapping("/organizer/{id}")
    Organizer get(@PathVariable Long id) {
        Organizer answer = organizersService.findById(id);
        return organizersService.findById(id);
    }

    @PostMapping("/add-banking-details/{organizerId}")
    Organizer addBankingDetails(@RequestBody BankingDetails bankingDetails, @PathVariable Long organizerId) {
        Organizer organizer = this.get(organizerId);
        organizer.setBankingDetails(bankingDetails);
        // update organizer model:
        create(organizer);
        return organizer;
    }

    @PostMapping("/create-event/{organizerId}")
    Organizer createEvent(@RequestBody Event event, @PathVariable Long organizerId) {
        Organizer organizer = this.get(organizerId);
        event.setDate(new Date());
        organizer.getEvents().add(event);
        create(organizer);
        return organizer;
    }

    @PostMapping("/organizer/")
    Organizer create(@RequestBody Organizer organizer) {
        return organizersService.save(organizer);
    }

    @DeleteMapping("/organizer/{id}")
    void deleteById(@PathVariable Long id) {
        try {
        organizersService.deleteById(id);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
