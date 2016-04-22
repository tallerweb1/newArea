package figuGeoTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TrianguloTest {

	@Test
	public void testAreaTriangulo() {
		figuGeo.Triangulo miArea = new figuGeo.Triangulo();
		Double valorEsperado = 8d;
		
		Double valorObtenido = miArea.calculaArea(4d,4d); // aca se ingresa valor
		
		assertEquals(valorEsperado,valorObtenido);
		
		System.out.print("\nEl Area del Cuadrado es: " + valorObtenido);
	}
	
	
}
