package com.tenxrs.tktbackend.services.event;

import com.tenxrs.tktbackend.models.Event;
import com.tenxrs.tktbackend.models.Organizer;
import com.tenxrs.tktbackend.services.CrudService;

import java.util.Set;

public interface EventsService extends CrudService<Event, Long> {
    Set<Event> findEventsByOrganizer(Organizer organizer);
}
