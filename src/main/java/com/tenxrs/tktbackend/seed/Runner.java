package com.tenxrs.tktbackend.seed;

import com.tenxrs.tktbackend.models.Event;
import com.tenxrs.tktbackend.models.Organizer;
import com.tenxrs.tktbackend.services.EventsService;
import com.tenxrs.tktbackend.services.OrganizersService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Component
public class Runner implements CommandLineRunner {
    private final EventsService eventsService;
    private final OrganizersService organizersService;

    public Runner(EventsService eventsService, OrganizersService organizersService) {
        this.eventsService = eventsService;
        this.organizersService = organizersService;
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
    }
}
