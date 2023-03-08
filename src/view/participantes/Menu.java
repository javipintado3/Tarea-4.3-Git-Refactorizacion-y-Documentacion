package view.participantes;

import view.Util;

public class Menu {

	/**
	 * Metodo para obtener el menu Integrantes
	 */
	public static void opcIntegrantes() {
		int opc;
		do {
			mostrarMenuIntegrantes();
			opc = Util.leerInt("Opción [0 - Volver] : ");
			switch (opc) {
			case 1 -> Opcion.getPartcipantes();
			case 2 -> Opcion.borrarParticantes();
			case 3 -> Opcion.editarParticipantes();
			case 4 -> Opcion.listarParticipantes();
			case 5 -> Opcion.listarAgrupacionesIntegrante();
			case 6 -> Opcion.ordenarPorNombre();
			}
		} while (opc != 0);
	}

	/**
	 * Metodo para mostrar el menu Integrantes
	 */
	private static void mostrarMenuIntegrantes() {
		Util.escribir("\n");
		Util.escribir("┌──────────────────────────┐");
		Util.escribir("│ GESTION DE PARTICIPANTES │");
		Util.escribir("└──────────────────────────┘");
		Util.escribir("  1. Añadir un participante.");
		Util.escribir("  2. Borrar un participante.");
		Util.escribir("  3. Editar los datos de un participante.");
		Util.escribir("  4. Listar todos los participantes.");
		Util.escribir("  5. Listar agrupaciones donde es integrante.");
		Util.escribir("  6. Ordenar por el nombre.");
	}
}
