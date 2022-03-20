package br.com.app.converterTemperature;

public class Conversor {
	private Temperatura temperatura;

	public Conversor(char escala, double temperatura) {
		this.temperatura = new Temperatura(escala, temperatura);
	}

	public Temperatura getTemperatura() {
		return temperatura;
	}

	public void converter() {

		switch (this.getTemperatura().getEscala()) {
		case 'C':
			this.celsiusParaFahrenheit();
			break;
		case 'F':
			this.fahrenheitParaCelsius();
			break;
		}
	}
	
    public void fahrenheitParaCelsius(){
        double tempFahrenheit, tempCelsius;

        tempFahrenheit = this.getTemperatura().getTemperatura();
        tempCelsius = (tempFahrenheit - 32.0) / 1.8;

        this.getTemperatura().setEscala('C');
        this.getTemperatura().setTemperatura(tempCelsius);
        System.out.printf("Temperatura: %.2f *%c\n", this.getTemperatura().getTemperatura(), this.getTemperatura().getEscala());
    } 
    
  
    public void celsiusParaFahrenheit(){
        double tempCelsius, tempFahrenheit;

        tempCelsius = this.getTemperatura().getTemperatura();
        tempFahrenheit = (1.8 * tempCelsius) + 32.0;

        this.getTemperatura().setEscala('F');
        this.getTemperatura().setTemperatura(tempFahrenheit);
        System.out.printf("Temperatura: %.2f *%c\n", this.getTemperatura().getTemperatura(), this.getTemperatura().getEscala());
    }


}
