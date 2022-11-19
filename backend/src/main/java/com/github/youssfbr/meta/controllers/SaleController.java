package com.github.youssfbr.meta.controllers;

import com.github.youssfbr.meta.entities.Sale;
import com.github.youssfbr.meta.services.SaleService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/sales")
public class SaleController {

    private final SaleService saleService;

    @GetMapping
    public Page<Sale> pageSales(
            @RequestParam(value="minDate", defaultValue = "") String minDate,
            @RequestParam(value="maxDate", defaultValue = "") String maxDate,
            Pageable pageable) {
        return saleService.pageSales(minDate, maxDate, pageable);
    }

}
