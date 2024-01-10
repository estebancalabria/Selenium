package org.educationit.cursoSelenium.claseUno.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSumar() {
		int a = 10;
		int b = 15;
		int res = a + b;
		assertEquals(25, res);
	}

	@Test // Atributo que dice que esto es una prueba unitaria
	void testRestar() {

		int a = 10;
		int b = 15;
		int res = a - b;
		System.out.println(res);
		assertEquals(-5, res);
	}

}
