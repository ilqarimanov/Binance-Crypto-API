package com.example.bitcoincrypto.dto;


import com.example.bitcoincrypto.service.model.AvgPrice;
import org.springframework.stereotype.Component;

@Component
public class AvgPriceDtoConverter {

    public AvgPriceDto convert(AvgPrice from){
        return new AvgPriceDto(from.getMins(),from.getPrice(),from.getSymbol());
    }



}
