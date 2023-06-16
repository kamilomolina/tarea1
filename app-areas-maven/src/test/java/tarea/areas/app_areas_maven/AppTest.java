package tarea.areas.app_areas_maven;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest 

{
	@BeforeClass
    public static void Inicio() {
        System.out.println("Método Setup, se ejecuta antes de iniciar una prueba");
    }
	
	//Circulo
	
		@Test
		public void areaCirculo1() {assertEquals(App.areaCirculo(4.0), 50.2654, 0.0001);}
		@Test
		public void areaCirculo2() {assertEquals(App.areaCirculo(5.0), 78.5398, 0.0001);}
		@Test
		public void areaCirculo3() {assertTrue(App.areaCirculo(0.0) == 0); }
		@Test
		public void areaCirculo4() {assertFalse(App.areaCirculo(8.5)==0);}
		
		//cuadrado
		
		@Test
		public void areaCuadrado1() {assertFalse(App.areaCuadrado(8.5)==0);
		}
		
		@Test
		public void areaCuadrado2() {assertEquals(App.areaCuadrado(150.0), 22500.0, 0.0001);
		}
		
		@Test
		public void areaCuadradoo3() {assertTrue(App.areaCuadrado(0.0) == 0);
		}
		
		//areaRectangulo
		
		@Test
		public void areaRectangulo1() {assertFalse(App.areaRectangulo(8.5,590.5)==0);}
		
		@Test
		public void areaRectangulo2() {assertEquals(App.areaRectangulo(4,7), 28, 0.0001);
		}
		
		@Test
		public void areaRectangulo3() {assertEquals(App.areaRectangulo(5,6), 30, 0.0001);
		}
		
		//areaTriangulo
		
		@Test
		public void areaTriangulo1() {assertTrue(App.areaTriangulo(15.5,5)==38.75);}

		@Test
		public void areaTriangulo2() {assertFalse(App.areaRectangulo(8.5,150.2)==0);}
		
		@Test
	    public void areaTriangulo3 () {assertNotNull(App.areaTriangulo(10.5,15.8));}
		
@AfterClass
    public static void finalizacionPruebas() {
        System.out.println("Método TearDown, se ejecuta despues de una prueba");
        
    }
}