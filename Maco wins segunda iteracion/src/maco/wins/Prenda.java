package maco.wins;

public abstract class Prenda {
	private Integer valorFijoDelNegocio;
	private Boolean esImportada; /* atributo */
	private Marca marca;
	
	public Prenda(int valor, boolean importada, Marca nombre){
		valorFijoDelNegocio= valor;
		esImportada=importada;
		marca=nombre;
	}
	

	protected abstract double precioBaseDeLaPrenda();

	private double tasaDeImportacion() {
		return esImportada ? 1.3 : 1;
	}

	public double precioFinal() {

		return (valorFijoDelNegocio + precioBaseDeLaPrenda())
				* tasaDeImportacion()+ marca.coeficiente(precioBaseDeLaPrenda());
	}

}
