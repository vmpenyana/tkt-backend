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
        return saleRepository.save(object);
    }

    @Override
    public Sale findById(Long id) {
        return saleRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Sale object) {
        saleRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        saleRepository.deleteById(id);
    }
}
