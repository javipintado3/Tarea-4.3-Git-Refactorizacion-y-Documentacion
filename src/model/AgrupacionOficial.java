package model;

public abstract class AgrupacionOficial extends Agrupacion  {

	
	private final Integer MAX_INT = 10;
	private Integer contIntegrantes = 0;
	private Integer puntosObt;
	private Integrante[] integrantes;
	
	
	public AgrupacionOficial() {
		super();
		integrantes = new Integrante[MAX_INT];
	}
	
	public AgrupacionOficial(String nombre, String autor, String autorMusica, String autorLetra, String tipo, Integer puntosObt) {
		super(nombre, autor, autorMusica, autorLetra, tipo);
		setPuntosObt(puntosObt);
		integrantes = new Integrante[MAX_INT];
	}
	
	
	
	public Integer getContIntegrantes() {
		return contIntegrantes;
	}

	public void setContIntegrantes(Integer contIntegrantes) {
		this.contIntegrantes = contIntegrantes;
	}

	public abstract String caminitoDelFalla();


	public Integer getPuntosObt() {
		return puntosObt;
	}


	public void setPuntosObt(Integer puntosObt) {
		this.puntosObt = puntosObt;
	}


	public Integrante[] getIntegrantes() {
		return integrantes;
	}


	public void setIntegrantes(Integrante[] integrantes) {
		this.integrantes = integrantes;
	}
	
	public boolean insertarIntegrante(Integrante i) {
		boolean added = false;
		
		for (int x = 0; x < integrantes.length; x++) {
			if (integrantes[x] == null)
			integrantes[x] = i;
			added = true;
			break;
		} 
		
		return added;
	}
		
	public boolean eliminarIntegrante(Integrante i) {
			
		boolean delete = false;
			
		for (int x = 0; x < integrantes.length; x++) {
				if (integrantes[x] != null &&  integrantes[x].equals(i))
				integrantes[x] = null;
				delete = true;
				break;
		} 
			
		return delete;
	}
	
	public String listadoIntegrante() {
		String texto = "";
		for (int i = 0; i < integrantes.length; i++) {
			if (integrantes[i] != null) {
				texto += integrantes[i];
			}
		}
		return texto;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Puntos=" + puntosObt + ", integrantes=" + listadoIntegrante();
	}
	
	
	
	
	
}
