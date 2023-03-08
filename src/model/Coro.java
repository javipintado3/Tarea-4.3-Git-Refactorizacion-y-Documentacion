package model;

import java.util.Arrays;

public class Coro extends AgrupacionOficial {

	private Integer numBandurrias;
	private Integer numGuitarras;
	
	
	public Coro() {
		super();
	}
	
	public Coro(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz, Integer puntosObt, Integer numBandurrias, Integer numGuitarras) {
		super(nombre, autor, autorMusica, autorLetra, tipoDisfraz, puntosObt);
		setNumBandurrias(numBandurrias);
		setNumGuitarras(numGuitarras);
	}

	public Integer getNumBandurrias() {
		return numBandurrias;
	}

	public void setNumBandurrias(Integer numBandurrias) {
		this.numBandurrias = numBandurrias;
	}

	public Integer getNumGuitarras() {
		return numGuitarras;
	}

	public void setNumGuitarras(Integer numGuitarras) {
		this.numGuitarras = numGuitarras;
	}

	
	@Override
	public String toString() {
		return "Coro " + super.toString() + ", Número bandurrias=" + numBandurrias + ", Número guitarras=" + numGuitarras;
	}

	@Override
	public String cantarPresentacion() {
		
		return "Cantando la presentación del Coro del nombre" + getNombre();
	}
	@Override
	public String hacerTipo() {
		
		return "El coro " + getNombre() + " va de " + getTipoDisfraz();
	}
	@Override
	public String caminitoDelFalla() {
	
		return "El coro " + getNombre() + " va caminito del Falla";
	}
}
