package com.scandura.desvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import com.scandura.desvendas.repositories.SellerRepository;
import com.scandura.desvendas.entities.Seller;
import com.scandura.desvendas.dto.SellerDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {
    
    @Autowired
    private SellerRepository repository;

    public List<SellerDTO> findAll(){
        List<Seller> result =  repository.findAll();
        return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
    }
}
