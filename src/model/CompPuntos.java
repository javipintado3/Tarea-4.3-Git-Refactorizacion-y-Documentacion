package model;

import java.util.Comparator;

public class CompPuntos implements Comparator<Agrupacion> {

	@Override
	public int compare(Agrupacion o1, Agrupacion o2) {
		int comp = -1;
		if (o1 instanceof AgrupacionOficial && o2 instanceof AgrupacionOficial) {
			comp = ((AgrupacionOficial) o1).getPuntosObt().compareTo(((AgrupacionOficial) o2).getPuntosObt());
		}
		return comp;
	}

}
