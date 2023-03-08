package model;

import java.util.Arrays;

/**
 * Clase que hereda de la clase AgrupacionOficial, se
 * utiliza para crear Coros
 * @author JavierPintado
 *
 */
public class Coro extends AgrupacionOficial {

	/**
	 * Atributo numero de Bandurrias
	 */
	private Integer numBandurrias;
	/**
	 * Atributo numero de Guitarras
	 */
	private Integer numGuitarras;
	
	/**
	 * Constructor por defecto que hereda
	 * el constructor por defecto padre
	 */
	public Coro() {
		super();
	}
	
	/**
	 * Constructor con 8 parametros
	 * Crea objetos heredados del constructor de tipo AgrupacionOfical con
	 * con nombre, autor , autorMusica, autorLetra, tipo disfraz, puntos obtenidos
	 * y crea objetos tipo Coro con numBandurrias y numGuitarras
	 * @param nombre <i>Nombre de la agrupacion</i>
	 * @param autor <i>autor de la agrupacion</i>
	 * @param autorMusica <i>autor de la musica de la agrupacion</i>a
	 * @param autorLetra <i>autor de la letra de la agrupacion</i>
	 * @param tipoDisfraz <i>tipo de disfraz de la agrupacion</i>
	 * @param puntosObt <i>puntos obtenidos de agrupacion oficial </i>
	 * @param numBandurrias <i> numero de bandurrias</i>
	 * @param numGuitarras <i> numero de Guitarras</i>
	 */
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

	/**
	 * Metodo para mostrar por pantalla todos los atributos de la clase
	 * 
	 * @return <ul>
	 * 		   		<li>Cadena con los atributos de la clase</li>
	 * 		   </ul>
	 */
	@Override
	public String toString() {
		return "Coro " + super.toString() + ", Número bandurrias=" + numBandurrias + ", Número guitarras=" + numGuitarras;
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
		
		return "Cantando la presentación del Coro del nombre" + getNombre();
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
		
		return "El coro " + getNombre() + " va de " + getTipoDisfraz();
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
	
		return "El coro " + getNombre() + " va caminito del Falla";
	}
}
