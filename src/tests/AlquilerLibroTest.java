package tests;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import dominio.Alquiler;
import dominio.Cliente;
import dominio.Libro;
import dominio.LibroRegular;

class AlquilerLibroTest {

	@Test
	void test() {
		Libro elTunel = new LibroRegular("El Túnel");
		Libro antesDelFin = new LibroRegular("Antes del Fin");

		Alquiler alquilerElTunel = new Alquiler(elTunel, 5);
		Alquiler alquilerAntesDelFin = new Alquiler(antesDelFin, 3);

		Cliente yo = new Cliente("Javier");

		yo.alquilar(alquilerElTunel);
		yo.alquilar(alquilerAntesDelFin);

		Object[] resultado = yo.calcularDeudaYPuntosObtenidos();
		Object[] resultadoEsperado = { 10.0, 2 };
		assertArrayEquals(resultadoEsperado, resultado);
	}

}
