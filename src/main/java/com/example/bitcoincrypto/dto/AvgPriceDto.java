package com.example.bitcoincrypto.dto;

import java.math.BigDecimal;

public class AvgPriceDto {

    private int mins;
    private BigDecimal price;
    private String symbol;

    public int getMins() {
        return mins;
    }

    public void setMins(int mins) {
        this.mins = mins;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public AvgPriceDto(int mins, BigDecimal price, String symbol) {
        this.mins = mins;
        this.price = price;
        this.symbol = symbol;
    }

    public AvgPriceDto() {
    }
}
