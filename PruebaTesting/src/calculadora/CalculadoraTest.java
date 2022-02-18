/**
 * 
 */
package calculadora;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author David
 *
 */
class CalculadoraTest {

	@Test
	void sumaTest() {
		Calculadora calc = new Calculadora();
		assertEquals(2,calc.suma(1, 1), "SE debería devolver la suma");
	}
	
	@Test
	void divideTest() {
		Calculadora calc = new Calculadora();
		assertEquals(2, calc.divide(8, 4), "La división no es correcta");
		assertThrows(ArithmeticException.class, () -> calc.divide(2,0));
	}
	
	@Test
	void parTest() {
		Calculadora calc = new Calculadora();
		assertTrue(calc.esPar(8));
		assertFalse(calc.esPar(9));
	}
	
	@Test
	void getEStadoIMCTest() {
		Calculadora calc = new Calculadora();
		assertEquals("Bajo peso", calc.getEstadoIMC(16));
		
	}
	
	

}
