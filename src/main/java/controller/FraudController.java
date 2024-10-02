package com.example.fraudservice.controller;

import com.example.fraudservice.service.FraudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fraud")
public class FraudController {

    @Autowired
    private FraudService fraudService;

    @GetMapping("/check/{cardNumber}")
    public String checkCard(@PathVariable String cardNumber) {
        boolean isBlacklisted = fraudService.isCardBlacklisted(cardNumber);
        return isBlacklisted ? "Card is blacklisted" : "Card is not blacklisted";
    }
}
