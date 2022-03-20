package br.com.app.converterTemperature;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConversorCelsiusTest {
	private Conversor conversorTest1;
	private Conversor conversorTest2; 
 
	@BeforeEach 
	public void setup() {
		conversorTest1 = new Conversor('C', 300);
		conversorTest2 = new Conversor('C', 100);

	}

	@Test
	public void testeConvertendoDeCelsiusParaFahrenheit1() {
		conversorTest1.converter();
		assertEquals(conversorTest1.getTemperatura().getEscala(), 'F');
		assertEquals(conversorTest1.getTemperatura().getTemperatura(), 572.00);
	}
	
	@Test
	public void testeConvertendoDeCelsiusParaFahrenheit2() {
		conversorTest2.converter();
		assertEquals(conversorTest2.getTemperatura().getEscala(), 'F');
		assertEquals(conversorTest2.getTemperatura().getTemperatura(), 212.00);
	}
}
