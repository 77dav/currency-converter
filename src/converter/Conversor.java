package converter;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Conversor {
	
	double valorRecibido;
	double valorUnDolar = 210;
	double valorUnEuro = 25.1;
	double valorUnaLibraEsterlina = 12.25;
	double valorUnYenJapones = 4000;
	double valorUnWonSulCoreano = 3.253;
	int opcionElegida;
	double valorConvertido;
	Scanner entrada = new Scanner(System.in);
	Divisa[] divisa = Divisa.values();
	
	public void convertirPeso() {
		for (int i = 0; i < divisa.length; i++) {
				System.out.println(i + " - " + divisa[i]);
		}
		
		System.out.println("introduce el numero de divisa a convertir:");
		opcionElegida = entrada.nextInt();
		
		System.out.println("introduce la cantidad:");
		valorRecibido = entrada.nextDouble();
		
		switch (opcionElegida) {
		case 0:
			valorConvertido =  valorRecibido / valorUnDolar;
			System.out.println(valorRecibido + " pesos " + " son " + valorConvertido + " dolares");
			break;
		case 1:
			valorConvertido = valorUnEuro * valorRecibido;
			System.out.println(valorRecibido + " pesos " + " son " + valorConvertido + " euros");
			break;

		default:
			System.out.println("Datos incorrectos");
			break;
		}
		
	}

}
