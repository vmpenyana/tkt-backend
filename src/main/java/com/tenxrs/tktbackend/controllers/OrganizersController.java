package com.tenxrs.tktbackend.controllers;

import com.tenxrs.tktbackend.models.BankingDetails;
import com.tenxrs.tktbackend.models.Event;
import com.tenxrs.tktbackend.models.Organizer;
import com.tenxrs.tktbackend.services.event.EventsService;
import com.tenxrs.tktbackend.services.organizer.OrganizersService;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;;
import java.util.HashSet;
import java.util.Set;


@RestController
public class OrganizersController {

    private final OrganizersService organizersService;
    private final EventsService eventsService;

    public OrganizersController(OrganizersService organizersService, EventsService eventsService) {
        this.organizersService = organizersService;
        this.eventsService = eventsService;
    }

    @PostMapping("/organizer/")
    Organizer create(@RequestBody Organizer organizer) {
        return organizersService.save(organizer);
    }
    @PostMapping("/create-event/{organizerId}")
    Organizer createEvent(@RequestBody Event event, @PathVariable Long organizerId) throws ParseException {
        Organizer organizer = this.get(organizerId);
        // TODO: 2023/09/15 Remove hard-coded date and time values
        event.setDate(new SimpleDateFormat("yyyy-MM-dd").parse("2023-10-14"));
        event.setTime(new SimpleDateFormat("HH:mm").parse("14:00"));
        Set<Event> organizerEvents = new HashSet<>(eventsService.findEventsByOrganizer(organizer));
        event.setOrganizer(organizer);
        organizerEvents.add(event);
        organizer.setEvents(organizerEvents);
        create(organizer);
        return organizer;
    }

    @PostMapping("/add-banking-details/{organizerId}")
    Organizer addBankingDetails(@RequestBody BankingDetails bankingDetails, @PathVariable Long organizerId) {
        Organizer organizer = this.get(organizerId);
        organizer.setBankingDetails(bankingDetails);
        // update organizer model:
        create(organizer);
        return organizer;
    }


    @GetMapping("/organizer/{id}")
    Organizer get(@PathVariable Long id) {
        return organizersService.findById(id);
    }

    @GetMapping("/get-organizer-events/{organizerId}")
    Set<Event> getEvents(@PathVariable Long organizerId) {
        return eventsService.findEventsByOrganizer(get(organizerId));
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
