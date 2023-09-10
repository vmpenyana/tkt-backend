package com.tenxrs.tktbackend.services;

import com.tenxrs.tktbackend.models.Event;
import com.tenxrs.tktbackend.repositories.EventRepository;
import org.springframework.stereotype.Service;

@Service
public class EventsServiceImpl implements EventsService {

    /**
     * CRUD - Create Read Update Delete
     */
    private final EventRepository eventRepository;

    public EventsServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public Event save(Event event) {
        eventRepository.save(event);
        return event;
    }
}
