package model;

import java.util.Arrays;

/**
 * Clase que hereda de la clase AgrupacionOficial, se
 * utiliza para crear Chirigotas, implementa 
 * la interfaz Callejera
 * @author JavierPintado
 * @version 1.1
 *
 */
public class Chirigota extends AgrupacionOficial implements Callejera {
	/*
	 * Atributo numero de Cuples
	 */
	private Integer numCuples;
	
	/**
	 * Constructor por defecto que hereda
	 * el constructor por defecto padre
	 */
	public Chirigota() {
		super();
	}
	
	/**
	 * Constructor con 7 parametros
	 * Crea objetos heredados del constructor de tipo AgrupacionOfical con
	 * con nombre, autor , autorMusica, autorLetra, tipo disfraz, puntos obtenidos
	 * y crea objetos tipo Chirigota con numCuples
	 * @param nombre <i>Nombre de la agrupacion</i>
	 * @param autor <i>autor de la agrupacion</i>
	 * @param autorMusica <i>autor de la musica de la agrupacion</i>a
	 * @param autorLetra <i>autor de la letra de la agrupacion</i>
	 * @param tipoDisfraz <i>tipo de disfraz de la agrupacion</i>
	 * @param puntosObt <i>puntos obtenidos de agrupacion oficial </i>
	 * @param numCuples <i> numeros de cuples de la chirigota </i>
	 */
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
	
	/**
	 * Metodo para mostrar por pantalla todos los atributos de la clase
	 * 
	 * @return <ul>
	 * 		   		<li>Cadena con los atributos de la clase</li>
	 * 		   </ul>
	 */
	@Override
	public String toString() {
		return "Chirigota " + super.toString() + ", cuples=" + numCuples;
	}
	
	/**
	 * Metodo que devuelve una texto especifico
	 * 
	 * @return <ul>
	 * 		   		<li>Texto con el getNombre() de la clase Agrupacion</li>
	 * 		   </ul>
	 */
	@Override
	public String cantarPresentacion() {
		
		return "Cantando la presentación de la chirigota del nombre" + getNombre();
	}
	
	/**
	 * Metodo que devuelve una texto especifico
	 * 
	 * @return <ul>
	 * 		   		<li>Texto con el getNombre() y getTipoDisfraz() de la clase Agrupacion</li>
	 * 		   </ul>
	 */
	@Override
	public String hacerTipo() {
		
		return "La chirigota " + getNombre() + " va de " + getTipoDisfraz();
	}
	
	/**
	 * Metodo que devuelve una texto especifico
	 * 
	 * @return <ul>
	 * 		   		<li>Texto con el getNombre()</li>
	 * 		   </ul>
	 */
	@Override
	public String amoAescucha() {
		return "Amo a escuche la chirigota" + getNombre();
	}
	
	/**
	 * Metodo que devuelve una texto especifico
	 * 
	 * @return <ul>
	 * 		   		<li>Texto con el getNombre() de la clase Agrupacion</li>
	 * 		   </ul>
	 */
	@Override
	public String caminitoDelFalla() {
		
		return "La chirigota " + getNombre() + " va caminito del Falla";
	}
}
