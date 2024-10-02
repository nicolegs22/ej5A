package com.example.fraudservice;

import com.example.fraudservice.service.FraudService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FraudServiceApplicationTests {

	@Test
	public void testCardCheck() {
		FraudService fraudService = new FraudService();

		// Prueba con tarjeta en lista negra
		assertTrue(fraudService.isCardBlacklisted("1234567812345678"));

		// Prueba con tarjeta no en lista negra
		assertFalse(fraudService.isCardBlacklisted("1111222233334444"));
	}
}
