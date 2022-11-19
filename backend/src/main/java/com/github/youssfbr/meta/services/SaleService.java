package com.github.youssfbr.meta.services;

import com.github.youssfbr.meta.entities.Sale;
import com.github.youssfbr.meta.repositories.ISaleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SaleService implements ISaleService {

    private final ISaleRepository saleRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Sale> listSales() {
        return saleRepository.findAll();
    }

}
