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
public class CompPuntos implements Comparator<Agrupacion> {

	/**
	 * Metodo que compara 2 objetos tipo Agrupacion por los puntos
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
		int comp = -1;
		if (o1 instanceof AgrupacionOficial && o2 instanceof AgrupacionOficial) {
			comp = ((AgrupacionOficial) o1).getPuntosObt().compareTo(((AgrupacionOficial) o2).getPuntosObt());
		}
		return comp;
	}

}
