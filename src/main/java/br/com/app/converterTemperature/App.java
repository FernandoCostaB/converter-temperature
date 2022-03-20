package br.com.app.converterTemperature;

public class App 
{
    public static void main( String[] args )
    {
    	  Conversor c = new Conversor('C', 300);

          c.converter();
          
          Conversor c1 = new Conversor('F', 148.89);

          c1.converter();
    } 
}
