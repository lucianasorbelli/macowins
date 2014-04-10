package maco.wins;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

import org.apache.commons.lang.time.DateUtils;

public class Macowins {
	private List<Venta> ventas;

	public Macowins() {

		this.ventas = new ArrayList<Venta>();
	}

	private Stream<Venta> ventasDeFecha(Date fecha) {

		return ventas.stream().filter(
				venta -> DateUtils.isSameDay(fecha, venta.getFecha()));
	}

	public double gananciasDelDia(Date fecha) {

		return ventasDeFecha(fecha).map(venta -> venta.valor())
				.mapToDouble(Double::doubleValue).sum();
	}

	public void vender(Prenda prenda, int cantidad) {
		Venta venta = new Venta(new Date(), prenda, cantidad);

		ventas.add(venta);
	}
}
