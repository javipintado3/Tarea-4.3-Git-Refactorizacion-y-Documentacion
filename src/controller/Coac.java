package controller;

import java.util.Arrays;

import model.Agrupacion;
import model.CompAutor;
import model.CompAutorMusica;
import model.CompMusicaLetra;
import model.CompPuntos;
import model.Integrante;

/**
 * <h2>Clase controladora del proyecto</h2>
 * @author JavierPintado
 * @version 1.1
 */
public class Coac {
	
	/**
	 * Atributo agrupacion del coac
	 */
	private Agrupacion[] agrupacion;
	/**
	 * Atributo integrantes del cocac
	 */
	private Integrante[] integrantes;
	
	/**
	 * Constructor con 2 parametros
	 * Crea objetos tipo Coac con totalAgrupaciones y totalIntegrantes
	 * @param totalAgrupaciones <i> total de agrupaciones del coac </i>
	 * @param totalIntegrantes <i> total de integrantes del coac </i>
	 */
	public Coac(int totalAgrupaciones, int totalIntegrantes) {
		agrupacion = new Agrupacion[totalAgrupaciones];
		integrantes = new Integrante[totalIntegrantes];
	}
	/**
	 * Metodo para inicializar el coac en la vista
	 * @param i <i> total de agrupaciones del coac </i>
	 */
	public Coac(int i) {
		
	}

	/**
	 * Metodo para inscribir una agrupacion 
	 * @param agrup <li>Objeto tipo agrupacion </li>
	 * @return <ul>
	 * 		   		<li>true: si se a inscrito una agrupacion</li>
	 * 				<li>false: si no se a inscrito una agrupacion</li>
	 * 		   </ul>
	 */
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
	
	/**
	 * Metodo para eliminar una agrupacion 
	 * @param agrup <li>Objeto tipo agrupacion </li>
	 * @return <ul>
	 * 		   		<li>true: si se a eliminado una agrupacion</li>
	 * 				<li>false: si no se a eliminado una agrupacion</li>
	 * 		   </ul>
	 */
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
	
	
	/**
	 * Metodo para inscribir un integrante 
	 * @param participantes <li>Objeto tipo integrante </li>
	 * @return <ul>
	 * 		   		<li>true: si se a inscrito un integrante</li>
	 * 				<li>false: si no se a inscrito un integrante</li>
	 * 		   </ul>
	 */
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
	
	/**
	 * Metodo para eliminar un integrante 
	 * @param participantes <li>Objeto tipo integrante </li>
	 * @return <ul>
	 * 		   		<li>true: si se a eliminado un integrante</li>
	 * 				<li>false: si no se a eliminado un integrante</li>
	 * 		   </ul>
	 */
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
	
	/**
	 * Metodo para ordenar por nombre
	 */
	public void ordenar_por_nombre() {
		Arrays.sort(agrupacion);
	}
	
	/**
	 * Metodo para ordenar por autor
	 */
	public void ordenar_por_autor() {
		Arrays.sort(agrupacion, new CompAutor());
	}
	
	/**
	 * Metodo para ordenar por autorMusica y autorMusicaLetra
	 */
	public void ordenar_por_autor_musica_letra() {
		Arrays.sort(agrupacion, new CompMusicaLetra());
	}
	
	/**
	 * Metodo para ordenar por puntos
	 */
	public void ordenar_por_puntos() {
		Arrays.sort(agrupacion, new CompPuntos());
	}
}
