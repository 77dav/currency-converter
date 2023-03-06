package converter;

import java.util.Scanner;

public class Conversor {
	
	String entrada;
	double datoRecibido;
	double valorUnDolar = 340;
	
	public double convertirPesoADolar() {
		Scanner datoDeEntrada = new Scanner(System.in);
		datoRecibido = datoDeEntrada.nextDouble();
		return datoRecibido;
	}
	public double convertirPesoAEuro() {
		return 0;
	}
	public double convertirPesoALibrasEsterlinas() {
		return 0;
	}
	public double convertirPesoAYen() {
		return 0;
	}
	public double convertirPesoAWonSulCoreano() {
		return 0;
	}
}
