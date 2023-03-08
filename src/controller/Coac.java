package controller;

import java.util.Arrays;

import model.Agrupacion;
import model.CompAutor;
import model.CompAutorMusica;
import model.CompMusicaLetra;
import model.CompPuntos;
import model.Integrante;

public class Coac {

	private Agrupacion[] agrupacion;
	private Integrante[] integrantes;
	
	public Coac(int totalAgrupaciones, int totalIntegrantes) {
		agrupacion = new Agrupacion[totalAgrupaciones];
		integrantes = new Integrante[totalIntegrantes];
	}
	
	public Coac(int i) {
		// TODO Auto-generated constructor stub
	}

	//Añade una agrupacion y te devuelve un boolean para saber si se añadido correctamente
	public boolean inscribir_agrupacion(Agrupacion agrup) {
		boolean added = false;
		
		for (int x = 0; x < agrupacion.length; x++) {
			if (agrupacion[x] == null)
			agrupacion[x] = agrup;
			added = true;
			break;
		} 
		
		return added;
	}
	
	//Elimina una agrupacion y te devuelve un boolean para saber si se eliminado correctamente
	public boolean eliminar_agrupacion(Agrupacion agrup) {
		
		boolean delete = false;
		
		for (int x = 0; x < agrupacion.length; x++) {
				if (agrupacion[x] != null &&  agrupacion[x].equals(agrup))
				agrupacion[x] = null;
				delete = true;
				break;
		} 
			
		return delete;
	}
	
	
	
	//Añade un integrante y te devuelve un boolean para saber si se añadido correctamente
	public boolean inscribir_integrante(Integrante participantes) {
		boolean added = false;
		
		for (int x = 0; x < integrantes.length; x++) {
			if (integrantes[x] == null)
			integrantes[x] = participantes;
			added = true;
			break;
		} 
		
		return added;
	}
	
	//Elimina un integrante y te devuelve un boolean para saber si se eliminado correctamente
	public boolean eliminar_integrante(Integrante participantes) {
		
		boolean delete = false;
		
		for (int x = 0; x < integrantes.length; x++) {
				if (integrantes[x] != null && integrantes[x].equals(participantes))
				integrantes[x] = null;
				delete = true;
				break;
		} 
			
		return delete;
	}
	
	//Metodos para ordenar con comparadores
	public void ordenar_por_nombre() {
		Arrays.sort(agrupacion);
	}
	
	public void ordenar_por_autor() {
		Arrays.sort(agrupacion, new CompAutor());
	}
	
	public void ordenar_por_autor_musica_letra() {
		Arrays.sort(agrupacion, new CompMusicaLetra());
	}
	
	
	public void ordenar_por_puntos() {
		Arrays.sort(agrupacion, new CompPuntos());
	}
}
