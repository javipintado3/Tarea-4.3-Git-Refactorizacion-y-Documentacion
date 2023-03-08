package view;

import java.util.Scanner;

	public class Util {

	

	public static double leerDouble(String pregunta) {
		Scanner leer = new Scanner (System.in);
		double respuesta;
		escribirEnLinea(pregunta);
		respuesta = Double.parseDouble(leer.nextLine());
		return respuesta;
	
	}
	
	public static int leerInt(String pregunta) {
		Scanner leer = new Scanner (System.in);
		int respuesta;
		escribirEnLinea(pregunta);
		respuesta = Integer.parseInt(leer.nextLine());
		return respuesta;
	
	}
	
	public static String leerString(String pregunta) {
		Scanner leer = new Scanner (System.in);
		String respuesta;
		escribirEnLinea(pregunta);
		respuesta =leer.nextLine();
		return respuesta;
	}
	
	public static void escribirEnLinea (String texto) {
		System.out.print(texto);
	}
	public static void escribir (String texto) {
		System.out.println(texto);
	}
	
}