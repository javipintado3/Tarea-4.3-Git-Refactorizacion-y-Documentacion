package view.agrupaciones;

import view.Util;

public class Menu {
	
	/**
	 * Metodo para obtener el menu agrupacion
	 */
	public static void opcGetAgrupacion() {
		int opc; 
		String pregunta;
		do {
			mostrarMenuGetAgrupacion();
			opc = Util.leerInt("Opción [0 - Salir] : ");
			switch (opc) {
			case 1 -> Opcion.getChirigota();
			case 2 -> Opcion.getComparsa();
			case 3 -> Opcion.getCoro();
			case 4 -> Opcion.getCuarteto();
			case 5 -> Opcion.getRomancero();
			}
			
		}while (opc != 0);
	}
	
	/**
	 * Metodo mostrar el menu agrupacion
	 */
	private static void mostrarMenuGetAgrupacion() {
		Util.escribir("\n");
		Util.escribir("╔═══════════════════════════════════╗");
		Util.escribir("║        AÑADIR AGRUPACIONES          ║");
		Util.escribir("╚═══════════════════════════════════╝");
		Util.escribir("  1. Añadir una chirigota ");
		Util.escribir("  2. Añadir una comparsa.");
		Util.escribir("  3. Añadir un coro.");
		Util.escribir("  4. Añadir un cuarteto.");
		Util.escribir("  5. Gestión del Concurso.");
	}
}
