package com.tenxrs.tktbackend.services.organizer;

import com.tenxrs.tktbackend.models.Organizer;
import com.tenxrs.tktbackend.repositories.OrganizerRepository;
import org.springframework.stereotype.Service;

@Service
public class OrganizersServiceImpl implements OrganizersService {

    private final OrganizerRepository organizerRepository;

    public OrganizersServiceImpl(OrganizerRepository organizerRepository) {
        this.organizerRepository = organizerRepository;
    }

    @Override
    public Organizer save(Organizer organizer) {
        return organizerRepository.save(organizer);
    }

    @Override
    public Organizer findById(Long aLong) {
        return null;
    }

    @Override
    public void delete(Organizer object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
