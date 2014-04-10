package maco.wins;

public class Saco extends Prenda {

	private int cantidadDeBotones;
	
	public Saco(int valor, boolean importada, Marca nombre, int cantidad) { 
		super(valor, importada, nombre);
		cantidadDeBotones=cantidad;
		
	}

	@Override
	protected double precioBaseDeLaPrenda() {
		return 300 + (10 * cantidadDeBotones);

	}

}
