package view;

import controller.Coac;
import model.Coro;
import model.Romancero;

/**
 * <h2>Clase Principal del proyecto</h2>
 * @author JavierPintado
 * @version 1.1
 */
public class Principal {
	
	public static Coac coac = new Coac(10);

	/**
	 * Metodo main
	 * @param args
	 */
	public static void main(String[] args) {
		gestionPrograma();
	}

	/**
	 * Metodo para gestionar el programa
	 */
	private static void gestionPrograma() {
		int opc;
		do {
			mostrarMenuPrincipal();
			opc = Util.leerInt("Opción [0 - Salir] : ");
			switch (opc) {
			case 1 -> GestionIntegrantes.opcIntegrantes();
			case 5 -> GestionConcurso.opcConcurso();
			}
		} while (opc != 0);
		finDelPrograma();
	}

	/**
	 * Metodo para ordenar los puntos
	 */
	private static void ordenarPorPuntos() {
		
		/*
		Coac c = new Coac(4, 1000);
		Romancero c1 = new Romancero();
		c.agrupacion[0] = c1;
		Coro c2 = new Coro();
		c2.setPuntosObt(5);
		c.agrupacion[1] = c2;
		Coro c3 = new Coro();
		c3.setPuntosObt(15);
		c.agrupacion[2] = c3;
		Coro c4 = new Coro();
		c4.setPuntosObt(2);
		c.agrupacion[3] = c4;
		c.ordenar_por_puntos();
		for (int i= 0; i<4; i++) {
			System.out.println(c.agrupacion[i]);
		}
		*/

	}
	
	/**
	 * Metodo para mostrar el menu principal
	 */
	private static void mostrarMenuPrincipal() {
		Util.escribir("\n");
		Util.escribir("╔═══════════════════════════════════╗");
		Util.escribir("║         GESTION PRINCIPAL         ║");
		Util.escribir("╚═══════════════════════════════════╝");
		Util.escribir("  1. Gestión de Participantes.");
		Util.escribir("  2. Añadir una agrupación.");
		Util.escribir("  3. Eliminar una agrupación.");
		Util.escribir("  4. Editar datos de una agrupación.");
		Util.escribir("  5. Gestión del Concurso.");
		Util.escribir("Listado de agrupaciones:");
		Util.escribir("  6. Listar todas.");
		Util.escribir("  7. Listar Chirigotas.");
		Util.escribir("  8. Listar Coros.");
		Util.escribir("  9. Listar Cuartetos.");
		Util.escribir(" 10. Listar Comparsas.");
		Util.escribir(" 11. Listar Romanceros.");
		Util.escribir("Ordenar el listado:");
		Util.escribir(" 12. Ordenar por el nombre.");
		Util.escribir(" 13. Ordenar por el autor.");
		Util.escribir(" 14. Ordenar por el autor de música/letra.");
	}
	
	
	
	/**
	 * Metodo para mostrar el fin del programa
	 */
	private static void finDelPrograma() {
		Util.escribir("\nFin del programa.");
		System.exit(0);
	}
}