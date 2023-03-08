package model;

import java.util.Comparator;

public class CompAutorMusica implements Comparator<Agrupacion> {

	@Override
	public int compare(Agrupacion o1, Agrupacion o2) {
		
		return o1.getAutorMusica().compareTo(o2.getAutorLetra());
	}

}
