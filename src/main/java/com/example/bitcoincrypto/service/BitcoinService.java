package com.example.bitcoincrypto.service;


import com.example.bitcoincrypto.dto.AvgPriceDto;
import com.example.bitcoincrypto.dto.AvgPriceDtoConverter;
import com.example.bitcoincrypto.service.model.AvgPrice;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BitcoinService {

    private final RestTemplate restTemplate;
    private final AvgPriceDtoConverter avgPriceDtoConverter;

    public BitcoinService(RestTemplate restTemplate, AvgPriceDtoConverter avgPriceDtoConverter) {
        this.restTemplate = restTemplate;
        this.avgPriceDtoConverter = avgPriceDtoConverter;
    }

    public AvgPriceDto getAvgPrice(String symbol) {
            AvgPrice avgPrice = restTemplate.getForObject("https://api1.binance.com/api/v3/avgPrice?symbol="+symbol,AvgPrice.class);
        avgPrice.setSymbol(symbol);

        return avgPriceDtoConverter.convert(avgPrice);

    }


}
