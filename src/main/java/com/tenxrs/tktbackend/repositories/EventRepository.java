package com.tenxrs.tktbackend.repositories;

import com.tenxrs.tktbackend.models.Event;
import com.tenxrs.tktbackend.models.Organizer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface EventRepository extends CrudRepository<Event, Long> {
    Set<Event> findAllByOrganizer(Organizer organizer);
}
