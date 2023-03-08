package view;

public class GestionConcurso {

	public static void opcConcurso() {
		int opc;
		do {
			mostrarMenuConcurso();
			opc = Util.leerInt("Opción [0 - Volver] : ");
			switch (opc) {
			case 1 -> vaCaminoFalla();
			case 2 -> hacerTipo();
			case 3 -> cantaLaPresentacion();
			case 4 -> asignarPuntos();
			case 5 -> listarTodos();
			case 6 -> listarChirigotas();
			case 7 -> listarCoros();
			case 8 -> listarCuartetos();
			case 9 -> listarComparsas();
			case 10 -> ordenarPorPuntos();
			case 11 -> ordenarPorNombre();
			case 12 -> ordenarPorAutor();
			}
		} while (opc != 0);
	}
	
	
	private static void ordenarPorAutor() {
		// TODO Auto-generated method stub
		
	}


	private static void ordenarPorNombre() {
		
	}


	private static void listarComparsas() {
		
	}


	private static void listarCuartetos() {
		
	}


	private static void listarCoros() {
	
	}


	private static void ordenarPorPuntos() {
		
	}


	private static void listarChirigotas() {
	
	}


	private static void listarTodos() {
	
	}


	private static void asignarPuntos() {
	
	}


	private static void cantaLaPresentacion() {
		
	}


	private static void hacerTipo() {
		
	}


	private static void vaCaminoFalla() {
		
	}


	private static void mostrarMenuConcurso() {
		Util.escribir("\n");
		Util.escribir("┌──────────────────────┐");
		Util.escribir("│ GESTION DEL CONCURSO │");
		Util.escribir("└──────────────────────┘");
		Util.escribir("Concurso:");
		Util.escribir("  1. Va camino del Falla.");
		Util.escribir("  2. Hacen el Tipo.");
		Util.escribir("  3. Canta la Presentación.");
		Util.escribir("  4. Asignar puntos.");
		Util.escribir("Listado de agrupaciones participantes:");
		Util.escribir("  5. Listar todos.");
		Util.escribir("  6. Listar Chirigotas.");
		Util.escribir("  7. Listar Coros.");
		Util.escribir("  8. Listar Cuartetos.");
		Util.escribir("  9. Listar Comparsas.");
		Util.escribir("Ordenación del listado:");
		Util.escribir(" 10. Ordenar por puntos.");
		Util.escribir(" 11. Ordenar por el nombre.");
		Util.escribir(" 12. Ordenar por el autor.");
		Util.escribir(" 13. Ordenar por autor de música/letra.");
	}
}
