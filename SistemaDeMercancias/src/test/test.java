package test;

import modulo.Sistema;

public class test {
	public static void main(String[] args) {

		Sistema sis = new Sistema();
//------------------------------------------------

		try {
			System.out.println("1-1");
			sis.agregarServicio("718392", "Mantenimiento Hidrolavadora", 2700, 10, true);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// ------------------------------------------------
		try {
			System.out.println("1-2");
			sis.agregarServicio("7183921", "Mantenimiento Hidrolavadora", 2700, 10, true);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

//------------------------------------------------

		try {
			System.out.println("1-3");
			sis.agregarProducto("782951", "Diyuntor", 4500, 25, true);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// ------------------------------------------------
		try {
			System.out.println("1-4");
			sis.agregarProducto("7829512", "Diyuntor", 4500, 25, true);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// ------------------------------------------------
		try {
			System.out.println("2-1");
			System.out.println("precio final-> " + sis.traerMercancia("7183921").calcularPrecioFinal());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// ------------------------------------------------

		try {
			System.out.println("2-2");
			System.out.println("precio final del producto--> " + sis.traerMercancia("7829512").calcularPrecioFinal());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// ------------------------------------------------

		try {
			System.out.println("3-1");
			sis.agregarProducto("3780173", "Lampara led 9w", 330, 10, true);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			sis.agregarServicio("1973851", "Mantenimiento de martillo automatico", 3500, 10, true);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {

			sis.agregarProducto("4897183", "Lampara led 11w", 450, 10, false);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {

			sis.agregarServicio("2871928", "Mantenimiento de aire condicionado", 2250, 10, false);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// ------------------------------------------------
		try {
			System.out.println("3-2");
			sis.agregarServicio("2871928", "Mantenimiento de aire condicionado", 2250, 10, false);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// ------------------------------------------------
		try {
			System.out.println("3-3");
			sis.agregarProducto("3780173", "Lampara led 9w", 330, 10, true);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// ------------------------------------------------
		try {
			System.out.println("4");
			System.out.println(sis.traerMercancia(true).toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
