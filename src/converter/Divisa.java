package converter;

public enum Divisa {

	DOLAR(390),
	EURO(400),
	LIBRA_ESTERLINA(512),
	YEN_JAPONES(4500),
	WON_SUL_COREANO(53047),
	PESO_ARG(1);	
	
	private double valorEnPesos;

	private Divisa(double valorEnPesos) {
		this.valorEnPesos = valorEnPesos;
	}

	public double getValorEnPesos() {
		return valorEnPesos;
	}
}
