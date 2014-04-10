package maco.wins;

public class Zapato extends Prenda {

	private int talle;

	public Zapato(int valor, boolean importada, Marca nombre, int tama�o) {
		super(valor, importada, nombre);
		talle = tama�o;
	}

	@Override
	protected double precioBaseDeLaPrenda() {
		return 400 + (5 * talle);
	}

}
