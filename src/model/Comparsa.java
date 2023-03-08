package model;

import java.util.Arrays;

public class Comparsa extends AgrupacionOficial {

	private String empresaAtezzo;
	
	
	public Comparsa() {
		super();
	}
	
	public Comparsa(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz, Integer puntosObt, String empresaAtezzo) {
		super(nombre, autor, autorMusica, autorLetra, tipoDisfraz, puntosObt);
		setEmpresaAtezzo(empresaAtezzo);
	}

	public String getEmpresaAtezzo() {
		return empresaAtezzo;
	}

	public void setEmpresaAtezzo(String empresaAtezzo) {
		this.empresaAtezzo = empresaAtezzo;
	}
	
	

	
	@Override
	public String toString() {
		return "Comparsa " + super.toString() + ", Empresa del atrezzo=" + empresaAtezzo;
	}

	@Override
	public String cantarPresentacion() {
		
		return "Cantando la presentación de la Comparsa del nombre" + getNombre();
	}
	@Override
	public String hacerTipo() {
		
		return "La comparsa " + getNombre() + " va de " + getTipoDisfraz();
	}
	@Override
	public String caminitoDelFalla() {
		
		return "La comparsa" + getNombre() + " va caminito del Falla";
	}
	
}
