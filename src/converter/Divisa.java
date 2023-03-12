package converter;

public enum Divisa {
	
	DOLAR(390),
	EURO(400),
	LIBRA_ESTERLINA(512),
	YEN_JAPONES(4500),
	WON_SUL_COREANO(53047);
	
	private int valorEnPesos;

	private Divisa(int valorEnPesos) {
		this.valorEnPesos = valorEnPesos;
	}

	public int getValorEnPesos() {
		return valorEnPesos;
	}
	
}
