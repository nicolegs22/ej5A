package com.example.fraudservice.model;

import java.util.HashSet;
import java.util.Set;

public class Blacklist {

    private static Set<String> blacklistedCards = new HashSet<>();

    static {
        // Simulamos que estas tarjetas están en la lista negra
        blacklistedCards.add("1234567812345678");
        blacklistedCards.add("9876543298765432");
    }

    public static boolean isBlacklisted(String cardNumber) {
        return blacklistedCards.contains(cardNumber);
    }
}
