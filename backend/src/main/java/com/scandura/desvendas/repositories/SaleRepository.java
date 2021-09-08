package com.scandura.desvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.scandura.desvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
    
}

