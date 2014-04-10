package maco.wins;

public class Sombrero extends Prenda {
	public Sombrero(int valor, boolean importada, Marca nombre, int coeficiente) {
		super(valor, importada, nombre);

		coeficienteDeMetrosexualidad = coeficiente;
	}

	private int coeficienteDeMetrosexualidad;

	@Override
	protected double precioBaseDeLaPrenda() {

		return 150 + coeficienteDeMetrosexualidad;
	}

}
