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
    public Sale save(Sale object) {
        return null;
    }

    @Override
    public Sale findById(Long aLong) {
        return null;
    }

    @Override
    public void delete(Sale object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
