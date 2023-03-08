package model;

import java.util.Comparator;

public class CompMusicaLetra implements Comparator<Agrupacion> {

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
