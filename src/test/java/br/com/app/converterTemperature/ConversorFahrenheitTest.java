package br.com.app.converterTemperature;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.app.converterTemperature.Conversor;

public class ConversorFahrenheitTest {
	 private Conversor conversorTest1;
	 private Conversor conversorTest2;

	    @BeforeEach
	    public void setup(){
	    	conversorTest1 = new Conversor('F', 212);
	        conversorTest2 = new Conversor('F', 32);
	    }


	    @Test
	    public void testeConvertendoDeFahrenheitParaCelsius1() {
	        conversorTest1.converter();
	        assertEquals(conversorTest1.getTemperatura().getEscala(), 'C');
	        assertEquals(conversorTest1.getTemperatura().getTemperatura(),100.00);
	    }
	    
	    @Test
	    public void testeConvertendoDeFahrenheitParaCelsius2() {
	        conversorTest2.converter();
	        assertEquals(conversorTest2.getTemperatura().getEscala(), 'C');
	        assertEquals(conversorTest2.getTemperatura().getTemperatura(), 0.00);
	    }
	    
	   
}
