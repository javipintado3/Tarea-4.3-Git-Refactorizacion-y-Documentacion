package model;

public class Romancero extends Agrupacion implements Callejera {

	private String tematica;
	
	public Romancero() {
		super();
	}
	
	public Romancero(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz, String tematica) {
		super(nombre, autor, autorMusica, autorLetra, tipoDisfraz);
		setTematica(tematica);
	}


	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}
	@Override
	public String cantarPresentacion() {
		
		return "Cantando la presentación del Romancero del nombre" + getNombre();
	}
	@Override
	public String hacerTipo() {
		
		return "El romancero " + getNombre() + " va de " + getTipoDisfraz();
	}

	@Override
	public String amoAescucha() {
		return "Amo a escuche el Romancero" + getNombre();
	}
	
	@Override
	public String toString() {
		return "Romancero " + super.toString() + ", Temática del cartelón=" + tematica;
	}
}
