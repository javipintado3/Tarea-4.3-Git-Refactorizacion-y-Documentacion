package model;

import java.util.Arrays;

public class Chirigota extends AgrupacionOficial implements Callejera {

	private Integer numCuples;
	
	
	public Chirigota() {
		super();
	}
	
	public Chirigota(String nombre, String autor, String autorMusica, String autorLetra, String tipo, Integer puntosObt, Integer numcuples) {
		super(nombre, autor, autorMusica, autorLetra, tipo, puntosObt);
		setNumCuples(numcuples);
	}

	public Integer getNumCuples() {
		return numCuples;
	}

	public void setNumCuples(Integer numCuples) {
		this.numCuples = numCuples;
	}
	
	@Override
	public String toString() {
		return "Chirigota " + super.toString() + ", cuples=" + numCuples;
	}

	@Override
	public String cantarPresentacion() {
		
		return "Cantando la presentación de la chirigota del nombre" + getNombre();
	}
	@Override
	public String hacerTipo() {
		
		return "La chirigota " + getNombre() + " va de " + getTipoDisfraz();
	}

	@Override
	public String amoAescucha() {
		return "Amo a escuche la chirigota" + getNombre();
	}
	@Override
	public String caminitoDelFalla() {
		
		return "La chirigota " + getNombre() + " va caminito del Falla";
	}
}
