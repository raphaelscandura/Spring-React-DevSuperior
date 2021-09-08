package com.scandura.desvendas.dto;

import java.time.LocalDate;

import com.scandura.desvendas.entities.Sale;

public class SaleDTO {
    private Long id;
    private Integer visited;
    private Integer deals;
    private double amount;
    private LocalDate date;

    private SellerDTO seller;

    public SaleDTO(){}

    public SaleDTO(Long id, Integer visited, Integer deals, double amount, LocalDate date){
        this.id = id;
        this.visited = visited;
        this.deals = deals;
        this.amount = amount;
        this.date = date;
    }

    public SaleDTO(Sale entity){
        id = entity.getId();
        visited = entity.getVisited();
        deals = entity.getDeals();
        amount = entity.getAmount();
        date = entity.getDate();
        seller = new SellerDTO(entity.getSeller());
    }

    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return this.id;
    }

    public void setVisited(Integer visited){
        this.visited = visited;
    }

    public Integer getVisited(){
        return this.visited;
    }

    public void setDeals(Integer deals){
        this.deals = deals;
    }

    public Integer getDeals(){
        return this.deals;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public double getAmount(){
        return this.amount;
    }

    public void setDate(LocalDate date){
        this.date = date;
    }

    public LocalDate getDate(){
        return this.date;
    }

    public void setSeller(SellerDTO seller){
        this.seller = seller;
    }

    public SellerDTO getSeller(){
        return this.seller;
    }
}
