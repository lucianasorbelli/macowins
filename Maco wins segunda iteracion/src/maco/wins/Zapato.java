package maco.wins;

public class Zapato extends Prenda {

	private int talle;

	public Zapato(int valor, boolean importada, Marca nombre, int tamaño) {
		super(valor, importada, nombre);
		talle = tamaño;
	}

	@Override
	protected double precioBaseDeLaPrenda() {
		return 400 + (5 * talle);
	}

}
