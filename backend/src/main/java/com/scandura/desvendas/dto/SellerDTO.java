package com.scandura.desvendas.dto;

import java.io.Serializable;
import com.scandura.desvendas.entities.Seller;

public class SellerDTO implements Serializable {
    private static final long serialVersionUID = 1;

    private Long id;
    private String name;

    public SellerDTO(){}

    public SellerDTO(Long id, String name){
        this.id = id;
        this.name = name;
    }

    public SellerDTO(Seller entity){
        id = entity.getId();
        name = entity.getName();
    }
    
    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
