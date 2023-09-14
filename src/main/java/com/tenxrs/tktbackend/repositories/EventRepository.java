package com.tenxrs.tktbackend.repositories;

import com.tenxrs.tktbackend.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends CrudRepository<Event, Long> {

}
