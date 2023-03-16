package converter;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Conversor {

	double valorConvertido, valorFinal;
	Scanner entrada = new Scanner(System.in);
	Divisa[] divisas = Divisa.values();
	
	public void convertirPesoAMonedaExtanjera(int indice,  double valorRecibido) {
		valorConvertido =  valorRecibido / divisas[indice-1].getValorEnPesos();
	}

	public void convertirMonedaExtanjeraAPeso(int indice,  double valorRecibido) {
		valorConvertido = valorRecibido * divisas[indice-1].getValorEnPesos();
	}
	
	public double getValorConvertido() {
		return valorConvertido;
	}
	
	public double valorFinalLimitado() {	
		BigDecimal bD = new BigDecimal(valorConvertido);
		bD = bD.setScale(6, RoundingMode.HALF_UP);
		valorFinal = bD.doubleValue();
		return valorFinal;
	}

//	public double getCantidadPesosRecibidos() {
//		return cantidadPesosRecibidos;
//	}
//
//	public void setCantidadPesosRecibidos(double cantidadPesosRecibidos) {
//		this.cantidadPesosRecibidos = cantidadPesosRecibidos;
//	}
	
	
	
}
