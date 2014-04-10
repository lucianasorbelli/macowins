package maco.wins;

import java.util.Date;

public class Venta {
	private Date fecha;
	private Prenda prenda;
	private int cantidad;

	public Venta(Date fecha, Prenda prenda, int cantidad) {
		this.fecha = fecha;
		this.prenda = prenda;
		this.cantidad = cantidad;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Prenda getPrenda() {
		return prenda;
	}

	public void setPrenda(Prenda prenda) {
		this.prenda = prenda;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double valor() {
		return prenda.precioFinal() * cantidad;
	}
}
