package com.example.bitcoincrypto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BitcoinCryptoApplication {

    public BitcoinCryptoApplication(ResponseErrorHandler responseErrorHandler) {
        this.responseErrorHandler = responseErrorHandler;
    }

    public static void main(String[] args) {
        SpringApplication.run(BitcoinCryptoApplication.class, args);
    }


    private final ResponseErrorHandler responseErrorHandler;

    @Bean
    public RestTemplate restTemplate(){
         return new RestTemplateBuilder().errorHandler(responseErrorHandler).build();
    }

}
