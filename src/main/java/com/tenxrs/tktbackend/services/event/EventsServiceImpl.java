package com.tenxrs.tktbackend.services.event;

import com.tenxrs.tktbackend.models.Event;
import com.tenxrs.tktbackend.models.Organizer;
import com.tenxrs.tktbackend.repositories.EventRepository;
import org.springframework.stereotype.Service;

import java.util.Set;

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

    @Override
    public Event findById(Long id) {
        return eventRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Event object) {
        eventRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        eventRepository.deleteById(id);
    }

    @Override
    public Set<Event> findEventsByOrganizer(Organizer organizer) {
        return eventRepository.findAllByOrganizer(organizer);
    }
}
