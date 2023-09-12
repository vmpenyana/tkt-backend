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
    public BankingDetails save(BankingDetails object) {
        return null;
    }

    @Override
    public BankingDetails findById(Long aLong) {
        return null;
    }

    @Override
    public void delete(BankingDetails object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
