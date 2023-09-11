package com.tenxrs.tktbackend.services.sale;

import com.tenxrs.tktbackend.models.Sale;
import com.tenxrs.tktbackend.repositories.SaleRepository;
import org.springframework.stereotype.Service;

@Service
public class SaleServiceImpl implements SaleService {

    private final SaleRepository saleRepository;

    public SaleServiceImpl(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    @Override
    public Sale record(Sale sale) {
        return saleRepository.save(sale);
    }
}
