package maco.wins;

public class Pantalon extends Prenda {

	private int telaUsada;

	public Pantalon(int valor, boolean importada, Marca nombre,
			int materialUsado) {
		super(valor, importada, nombre);
		telaUsada = materialUsado;

	}

	@Override
	protected double precioBaseDeLaPrenda() {
		return 250 + telaUsada;

	}

}
