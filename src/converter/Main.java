package converter;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Conversor conversor = new Conversor();
		//Scanner monedaElegida = new Scanner(System.in);
		
		//conversor.convertirPesoAMonedaExtanjera(Divisa.WON_SUL_COREANO);
		conversor.convertirMonedaExtanjeraAPeso(Divisa.YEN_JAPONES);
	}

}
