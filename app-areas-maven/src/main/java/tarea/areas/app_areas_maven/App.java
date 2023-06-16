package tarea.areas.app_areas_maven;

import java.util.Scanner;


public class App 
{
	private static Scanner teclado = new Scanner(System.in);
	public static void main( String[] args ){
	int opc = 0;
	do {
	 System.out.println("******Calculadora******");
	 System.out.println("1. Área del Círculo");
	 System.out.println("2. Área de un Cuadrado");
	 System.out.println("3. Área de un Rectangulo");
	 System.out.println("4. Área de un Triangulo");
	 System.out.println("5. Salir");
	 System.out.println("************************");
	 System.out.println("Escoja una de las opciones");
	 System.out.println("");
	 opc= leerEntero("");
	 Double numeros = null;
	 switch(opc) {	
	 case 1:
		 
		 System.out.println("Área de un Círculo");
		 numeros = areaCirculo(leerDecimal("Ingrese el radio del circulo: "));
		 
		 break;
		 
	 case 2:
		 
		 System.out.println("Área de un Cuadrado");
		 numeros = areaCuadrado(leerDecimal("Ingrese el lado: "));
		 
		 break;
		 
	 case 3:
		 
		 System.out.println("Área de un Rectangulo");
		 numeros = areaRectangulo(leerDecimal("Ingrese el lado a: "),leerDecimal("Ingrese el lado b: "));
		
		 break;
		 
	 case 4:
		 
		 System.out.println("Área de un Triangulo");
		 numeros = areaTriangulo(leerDecimal("Ingrese la base: "),leerDecimal("Ingrese la altura: "));
		 
		 break;
		 
	 case 5:
		 
		 System.out.println("Saliendo del Sistema :)");

         break;
	 
	 default:
		 
			System.out.println("Opción no válida, ingrese una de las opciones del menú");
			
			break;
			
	 }
	 System.out.println("El resultado es: "+numeros);
		System.out.println("-------------------------------");
	}while(opc != 5);
	
	
	
	
	}
	private static int leerEntero(String mensaje) {
		teclado = new Scanner(System.in);
		System.out.println(mensaje);
		return teclado.nextInt();
	}
	
	private static double leerDecimal(String mensaje) {
		teclado = new Scanner(System.in);
		double numero = -1;

	    System.out.println(mensaje);
	    numero = teclado.nextDouble();

	    while (numero < 0) {
	        System.out.println("No se permiten números negativos, ingrese un valor positivo");
	        System.out.println(mensaje);
	        numero = teclado.nextDouble();
	    }
	    return numero;
	}
	public static double areaCirculo(double r) {
		 double resultado=0;
		 
		 if(r<0) {
	      System.err.println("No se permiten números negativos, ingrese un valor positivo");
		 }
		 else {
		 resultado=3.1416*(r*r);
		 	 }
		 
		 return resultado;
	}
	 public static double areaCuadrado(double lado) {
		 double resultado=0;
		 if(lado<0) {
	      System.err.println("No se permiten números negativos, ingrese un valor positivo");
		 }
		 else {
		 resultado=lado*lado;
		
		 }
		 return resultado;
	 }
	 public static double areaRectangulo(double ladoa,double ladob) {
		 double resultado=0;
		 if(ladoa<0 || ladob<0) {
	      System.err.println("No se permiten números negativos, ingrese un valor positivo");
	      
		 }
		 else {
		 resultado=ladoa*ladob;
		 }
		 return resultado;
	 }
	 public static double areaTriangulo(double base,double altura) {
		 double resultado=0;
		 if(base<0 || altura<0) {
	      System.err.println("No se permiten números negativos, ingrese un valor positivo");
		 }
		 else {
		 resultado=(base*altura)/2;
		 }
		 return resultado;
	 }
}