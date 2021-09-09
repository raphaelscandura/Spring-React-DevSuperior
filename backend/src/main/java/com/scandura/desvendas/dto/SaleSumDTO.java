package com.scandura.desvendas.dto;

import java.io.Serializable;

import com.scandura.desvendas.entities.Seller;

public class SaleSumDTO implements Serializable{
    private static final long serialVersionUID = 1L;

    private String sellerName;
    private double sum;

    public SaleSumDTO(Seller seller, double sum){
        this.setSellerName(seller.getName());
        this.setSum(sum);
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }
}
