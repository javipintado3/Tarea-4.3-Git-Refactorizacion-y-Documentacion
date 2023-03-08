package view;

public class GestionConcurso {

	/**
	 * Metodo para ver las opciones del concurso
	 */
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
	
	/**
	 * Metodo para ordenar por autor
	 */
	private static void ordenarPorAutor() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Metodo para ordenar por nombre
	 */
	private static void ordenarPorNombre() {
		
	}

	/**
	 * Metodo para listar por Comparsas
	 */
	private static void listarComparsas() {
		
	}

	/**
	 * Metodo para listar por Cuartetos
	 */
	private static void listarCuartetos() {
		
	}

	/**
	 * Metodo para listar por coros
	 */
	private static void listarCoros() {
	
	}

	/**
	 * Metodo para ordenar por puntos
	 */
	private static void ordenarPorPuntos() {
		
	}

	 /**
	 * Metodo para listar chirigotas
	 */
	private static void listarChirigotas() {
	
	}

	/**
	 * Metodo para listar todos
	 */
	private static void listarTodos() {
	
	}

	/**
	 * Metodo para asignar puntos
	 */
	private static void asignarPuntos() {
	
	}

	/**
	 * Metodo para llamar al metodo cantaLaPresentacion()
	 */
	private static void cantaLaPresentacion() {
		
	}

	/**
	 * Metodo para llamar al metodo hacertipo()
	 */
	private static void hacerTipo() {
		
	}

	/**
	 * Metodo para llamar al metodo vaCaminoFalla()
	 */
	private static void vaCaminoFalla() {
		
	}

	/**
	 * Metodo para mostrar el menu del concurso
	 */
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
