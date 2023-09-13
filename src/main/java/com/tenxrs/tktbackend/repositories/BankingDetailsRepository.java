package com.tenxrs.tktbackend.repositories;

import com.tenxrs.tktbackend.models.BankingDetails;
import com.tenxrs.tktbackend.models.Organizer;
import org.springframework.data.repository.CrudRepository;

public interface BankingDetailsRepository extends CrudRepository<BankingDetails, Long> {
//    BankingDetails findBankingDetailsByOrganizer(Organizer organizer);
}
