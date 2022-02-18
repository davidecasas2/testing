/**
 * 
 */
package calculadora;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author David
 *
 */
class CalculadoraTest {

	
	private static Calculadora calc;

	@BeforeAll
	 static void incializarClase() {
		calc = new Calculadora();
		System.out.println("Al inicializar la clase test");
	}
	
	
	@BeforeEach
	void incializar() {
		System.out.println("Dentro de BeforeEach");
	}
	
	@Test
	void sumaTest() {	 
		assertEquals(2,calc.suma(1, 1), "SE debería devolver la suma");
	}
	
	@Test
	void divideTest() {
		assertEquals(2, calc.divide(8, 4), "La división no es correcta");
		assertThrows(ArithmeticException.class, () -> calc.divide(2,0));
	}
	
	@Test
	void parTest() {
		assertTrue(calc.esPar(8));
		assertFalse(calc.esPar(9));
	}
	
	@Test
	void esPrimoTest() {
		assertTrue(calc.esPrimo(7));
		assertFalse(calc.esPrimo(8));
		assertFalse(calc.esPrimo(-8));
		assertTrue(calc.esPrimo(-7));
	}
	
	@Test
	void getEStadoIMCTest() {
		assertAll(		
		()-> assertEquals("Bajo peso", calc.getEstadoIMC(16)),
		()->assertEquals("Peso normal (saludable)", calc.getEstadoIMC(18.5f)),
		()->assertEquals("Peso normal (saludable)", calc.getEstadoIMC(22f)),
		()->assertEquals("Peso normal (saludable)", calc.getEstadoIMC(24.9f)),
		()->assertEquals("Sobrepeso", calc.getEstadoIMC(24.99f)),
		()->assertEquals("Sobrepeso", calc.getEstadoIMC(26f)),
		()->assertEquals("Obesidad premórbida", calc.getEstadoIMC(29.99f)),
		()->assertEquals("Obesidad premórbida", calc.getEstadoIMC(32f)),
		()->assertEquals("Obesidad mórbida", calc.getEstadoIMC(42f))
				);
	}
	
	@Test
	void factorialTest() {
		assertEquals(1, calc.factorial(0));
		assertEquals(120, calc.factorial(5));
		assertThrows(ArithmeticException.class, 
				()->calc.factorial(-4));
	}
	
	@Test
	void rotarDerechaTest() {
		int original [] = {1, 2, 3, 4, 5}; 
		int rotado [] = {5, 1, 2, 3, 4}; 
		calc.rotarDerecha(original);
		assertArrayEquals(rotado, original);
	}
	
	
}
