package model;

import java.util.Arrays;

public class Cuarteto extends AgrupacionOficial implements Callejera {

	private Integer numMiembros;
	
	
	public Cuarteto() {
		super();
	}
	
	public Cuarteto(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz, Integer puntosObt, Integer numMiembros) {
		super(nombre, autor, autorMusica, autorLetra, tipoDisfraz, puntosObt);
		setNumMiembros(super.getContIntegrantes());
	}

	public Integer getNumMiembros() {
		return numMiembros;
	}

	public void setNumMiembros(Integer numMiembros) {
		this.numMiembros = numMiembros;
	}
	

	@Override
	public String toString() {
		return "Cuarteto " + super.toString() + ", Número miembros=" + super.getContIntegrantes();
	}

	public String cantarPresentacion() {
		
		return "Cantando la presentación del Cuarteto del nombre" + getNombre();
	}
	
	public String hacerTipo() {
		
		return "El cuarteto " + getNombre() + " va de " + getTipoDisfraz();
	}

	@Override
	public String amoAescucha() {
		
		return "Amo a escuche el Cuarteto" + getNombre();
	}
	@Override
	public String caminitoDelFalla() {
		
		return "El cuarteto " + getNombre() + " va caminito del Falla";
	}
	
	
	
}
