package figuGeoTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CuadradoTest {

	@Test
	public void testAreaCuadrado() {
		figuGeo.Cuadrado miArea = new figuGeo.Cuadrado();
		Double valorEsperado = 9d;
		
		Double valorObtenido = miArea.calculaArea(3d); // aca se ingresa valor
		
		assertEquals(valorEsperado,valorObtenido);
		
		System.out.print("\nEl Area del Cuadrado es: " + valorObtenido);
	}
	
	
}
