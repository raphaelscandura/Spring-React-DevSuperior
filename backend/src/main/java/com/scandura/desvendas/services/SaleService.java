package com.scandura.desvendas.services;

import java.util.List;

import com.scandura.desvendas.repositories.SaleRepository;
import com.scandura.desvendas.repositories.SellerRepository;
import com.scandura.desvendas.entities.Sale;
import com.scandura.desvendas.dto.SaleDTO;
import com.scandura.desvendas.dto.SaleSumDTO;
import com.scandura.desvendas.dto.SalesSuccessDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleService {
    
    @Autowired
    private SaleRepository repository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable){
        sellerRepository.findAll();
        Page<Sale> result =  repository.findAll(pageable);
        return result.map(x -> new SaleDTO(x));
    }

    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountGroupedBySeller(){
        return repository.amountGroupedBySeller();
    }

    @Transactional(readOnly = true)
    public List<SalesSuccessDTO> successGroupedBySeller(){
        return repository.successGroupedBySeller();
    }
}