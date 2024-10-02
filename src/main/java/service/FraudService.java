package com.example.Fraud_Service.raudservice.service;

import com.example.fraudservice.model.Blacklist;
import org.springframework.stereotype.Service;

@Service
public class FraudService {

    public boolean isCardBlacklisted(String cardNumber) {
        return Blacklist.isBlacklisted(cardNumber);
    }
}
