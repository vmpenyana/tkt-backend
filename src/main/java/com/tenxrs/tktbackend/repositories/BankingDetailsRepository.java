package com.tenxrs.tktbackend.repositories;

import com.tenxrs.tktbackend.models.BankingDetails;
import org.springframework.data.repository.CrudRepository;

public interface BankingDetailsRepository extends CrudRepository<BankingDetails, Long> {
}
