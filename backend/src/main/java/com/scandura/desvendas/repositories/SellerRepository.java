package com.scandura.desvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.scandura.desvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{
    
}
