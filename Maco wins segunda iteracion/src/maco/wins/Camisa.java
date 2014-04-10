package maco.wins;

public class Camisa extends Prenda {

	public Camisa(int valor, boolean importada, Marca nombre) {
		super(valor, importada, nombre);

	}

	/*
	 * En el enunciado no esta aclarado si camisa sigue siendo parte del modelo
	 * de datos correspondiendose con lo que decia el enunciado(que continua la
	 * estructura del anterior se agrega
	 */
	@Override
	protected double precioBaseDeLaPrenda() {

		return 200d;
	}

}