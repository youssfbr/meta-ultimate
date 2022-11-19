package com.github.youssfbr.meta.services;

import com.github.youssfbr.meta.entities.Sale;
import com.github.youssfbr.meta.repositories.ISaleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

@Service
@RequiredArgsConstructor
public class SaleService implements ISaleService {

    private final ISaleRepository saleRepository;

    @Override
    @Transactional(readOnly = true)
    public Page<Sale> pageSales(String minDate, String maxDate, Pageable pageable) {

        LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());

        LocalDate min = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate);
        LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate);

        return saleRepository.findSales(min, max, pageable);
    }

}
