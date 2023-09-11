package com.tenxrs.tktbackend.services.bankingDetails;

import com.tenxrs.tktbackend.models.BankingDetails;
import com.tenxrs.tktbackend.repositories.BankingDetailsRepository;
import org.springframework.stereotype.Service;

@Service
public class BankingDetailsServiceImpl implements BankingDetailsService {
    private final BankingDetailsRepository bankingDetailsRepository;

    public BankingDetailsServiceImpl(BankingDetailsRepository bankingDetailsRepository) {
        this.bankingDetailsRepository = bankingDetailsRepository;
    }

    @Override
    public BankingDetails save(BankingDetails bankingDetails) {
        return bankingDetailsRepository.save(bankingDetails);
    }
}
