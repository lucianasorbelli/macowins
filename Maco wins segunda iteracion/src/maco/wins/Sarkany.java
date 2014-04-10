package maco.wins;

public class Sarkany implements Marca {

	@Override
	public double coeficiente(double precioBase) {

		return precioBase > 500 ? precioBase * 0.35 : precioBase * 0.1;
	}
}
