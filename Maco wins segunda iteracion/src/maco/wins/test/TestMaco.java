package maco.wins.test;

import java.util.Date;

import maco.wins.Armani;
import maco.wins.Macowins;
import maco.wins.Marca;
import maco.wins.Prenda;
import maco.wins.Saco;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMaco {

	private static Macowins mac;

	@Before
	public void init() {
		mac = new Macowins();
		Marca marca = new Armani();
		Prenda prenda = new Saco(10, true, marca, 1);

		mac.vender(prenda, 1);
		/*
		 * Test sencillo, deberia dar 617,5 ya que el precio es 10, tiene 1 solo
		 * boton, es importada y es de Armani, por lo tanto la ecuacion es
		 * (10+310)*1.3+(310*0.65)
		 */

	}

	@Test
	public void test() {

		Assert.assertEquals("Error", 617.5,
				mac.gananciasDelDia(new Date()), 1d);

	}

}
