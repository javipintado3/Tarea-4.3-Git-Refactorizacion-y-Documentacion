package model;

import java.util.Comparator;

/**
 * <h2>Clase comparadora que implementa la interfaz Comparable seleccionando la
 * clase Agrupacion</h2>
 * 
 * @author JavierPintado
 * @version 1.1
 *
 */
public class CompMusicaLetra implements Comparator<Agrupacion> {

	/**
	 * Metodo que compara 2 objetos tipo Agrupacion por el autorMusica o por el
	 * autorLetra
	 * 
	 * @param o1 <i> Objeto tipo agrupacion </i>
	 * @param o2 <i> Objeto tipo agrupacion </i>
	 * @return
	 *         <ul>
	 *         <li>Un integer con valor 0, 1 o -1</li>
	 *         </ul>
	 */
	@Override
	public int compare(Agrupacion o1, Agrupacion o2) {

		int comp;

		comp = o1.getAutorMusica().compareTo(o2.getAutorMusica());

		if (comp == 0) {
			comp = o1.getAutorLetra().compareTo(o2.getAutorLetra());
		}

		return comp;
	}

}
