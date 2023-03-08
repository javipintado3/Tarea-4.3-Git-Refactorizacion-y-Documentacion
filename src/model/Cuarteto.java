package model;

import java.util.Arrays;

/**
 * <h2>Clase que hereda de la clase AgrupacionOficial, se utiliza para crear
 * Cuartetos, implementa la interfaz Callejera</h2>
 * 
 * @author JavierPintado
 * @version 1.1
 *
 */
public class Cuarteto extends AgrupacionOficial implements Callejera {

	/**
	 * Atributo numero de miembros
	 */
	private Integer numMiembros;

	/**
	 * Constructor por defecto que hereda el constructor por defecto padre
	 */
	public Cuarteto() {
		super();
	}

	/**
	 * Constructor con 7 parametros Crea objetos heredados del constructor de tipo
	 * AgrupacionOfical con con nombre, autor , autorMusica, autorLetra, tipo
	 * disfraz, puntos obtenidos y crea objetos tipo Callejera con numMiembros
	 * 
	 * @param nombre      <i>Nombre de la agrupacion</i>
	 * @param autor       <i>autor de la agrupacion</i>
	 * @param autorMusica <i>autor de la musica de la agrupacion</i>a
	 * @param autorLetra  <i>autor de la letra de la agrupacion</i>
	 * @param tipoDisfraz <i>tipo de disfraz de la agrupacion</i>
	 * @param puntosObt   <i>puntos obtenidos de agrupacion oficial </i>
	 * @param numMiembros <i> numero de miembros </i>
	 */
	public Cuarteto(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz,
			Integer puntosObt, Integer numMiembros) {
		super(nombre, autor, autorMusica, autorLetra, tipoDisfraz, puntosObt);
		setNumMiembros(super.getContIntegrantes());
	}

	public Integer getNumMiembros() {
		return numMiembros;
	}

	public void setNumMiembros(Integer numMiembros) {
		this.numMiembros = numMiembros;
	}

	/**
	 * Metodo para mostrar por pantalla todos los atributos de la clase
	 * 
	 * @return
	 *         <ul>
	 *         <li>Cadena con los atributos de la clase</li>
	 *         </ul>
	 */
	@Override
	public String toString() {
		return "Cuarteto " + super.toString() + ", Número miembros=" + super.getContIntegrantes();
	}

	/**
	 * Metodo que devuelve una texto especifico
	 * 
	 * @return
	 *         <ul>
	 *         <li>Texto con el getNombre() de la clase Agrupacion</li>
	 *         </ul>
	 */
	public String cantarPresentacion() {

		return "Cantando la presentación del Cuarteto del nombre" + getNombre();
	}

	/**
	 * Metodo que devuelve una texto especifico
	 * 
	 * @return
	 *         <ul>
	 *         <li>Texto con el getNombre() y getTipoDisfraz() de la clase
	 *         Agrupacion</li>
	 *         </ul>
	 */
	public String hacerTipo() {

		return "El cuarteto " + getNombre() + " va de " + getTipoDisfraz();
	}

	/**
	 * Metodo que devuelve una texto especifico
	 * 
	 * @return
	 *         <ul>
	 *         <li>Texto con el getNombre()</li>
	 *         </ul>
	 */
	@Override
	public String amoAescucha() {

		return "Amo a escuche el Cuarteto" + getNombre();
	}

	/**
	 * Metodo que devuelve una texto especifico
	 * 
	 * @return
	 *         <ul>
	 *         <li>Texto con el getNombre() de la clase Agrupacion</li>
	 *         </ul>
	 */
	@Override
	public String caminitoDelFalla() {

		return "El cuarteto " + getNombre() + " va caminito del Falla";
	}

}
