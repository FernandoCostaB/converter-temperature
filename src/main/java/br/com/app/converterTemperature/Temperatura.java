package br.com.app.converterTemperature;

public class Temperatura {
	private char escala;
	private double temperatura;

	public Temperatura(char escala, char temperatura) {
		this.setEscala(escala);
		this.setTemperatura(temperatura);
	}

	public char getEscala() {
		return this.escala;
	}

	public void setEscala(char escala) {
		this.escala = escala;
	}

	public double getTemperatura() {
		return this.temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
}
