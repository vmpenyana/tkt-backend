package com.tenxrs.tktbackend.services.bankingDetails;

import com.tenxrs.tktbackend.models.BankingDetails;
import com.tenxrs.tktbackend.models.Organizer;
import com.tenxrs.tktbackend.repositories.BankingDetailsRepository;
import org.springframework.stereotype.Service;

@Service
public class BankingDetailsServiceImpl implements BankingDetailsService {
    private final BankingDetailsRepository bankingDetailsRepository;

    public BankingDetailsServiceImpl(BankingDetailsRepository bankingDetailsRepository) {
        this.bankingDetailsRepository = bankingDetailsRepository;
    }

    @Override
    public BankingDetails save(BankingDetails object) {
        return bankingDetailsRepository.save(object);
    }

    @Override
    public BankingDetails findById(Long id) {
        return bankingDetailsRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(BankingDetails object) {
        bankingDetailsRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        bankingDetailsRepository.deleteById(id);
    }

//    @Override
//    public BankingDetails findBankingDetailsByOrganizer(Organizer organizer) {
//        return bankingDetailsRepository.findBankingDetailsByOrganizer(organizer);
//    }
}
