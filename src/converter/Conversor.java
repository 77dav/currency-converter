package converter;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Conversor {
	
	double cantidadPesosRecibidos;
	double cantidadDivisaRecibidos;
	int opcionElegida;
	double valorConvertido;
	Scanner entrada = new Scanner(System.in);
	Divisa[] divisas = Divisa.values();
	
	public void convertirPesoAMonedaExtanjera(Divisa divisa) {
		
		for (int i = 0; i < divisas.length; i++) {
				System.out.println(i + " - " + divisas[i]);
		}
		
		System.out.println("introduce el numero de divisa a convertir:");
		opcionElegida = entrada.nextInt();
		
		System.out.println("introduce la cantidad:");
		cantidadPesosRecibidos = entrada.nextDouble();
		
		valorConvertido =  cantidadPesosRecibidos / divisa.getValorEnPesos();
		System.out.println(cantidadPesosRecibidos + " pesos " + "son " + valorConvertido + " " + divisa.name());
		
	}

	public void convertirMonedaExtanjeraAPeso(Divisa divisa) {
		
		System.out.println("introduce la cantidad:");
		cantidadDivisaRecibidos = entrada.nextDouble();
		
		valorConvertido = divisa.getValorEnPesos() * cantidadDivisaRecibidos;
		System.out.println(cantidadDivisaRecibidos + " " + divisa.name() + " son " + valorConvertido + " pesos");
		
	}
	
	
}
