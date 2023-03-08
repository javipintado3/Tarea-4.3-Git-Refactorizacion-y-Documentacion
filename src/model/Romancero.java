package model;

/**
 * <h2>Clase que hereda de la clase Agrupacion, se utiliza para crear
 * Romanceros, implementa la interfaz Callejera</h2>
 * 
 * @author JavierPintado
 * @version 1.1
 *
 */
public class Romancero extends Agrupacion implements Callejera {
	/**
	 * Atributo tematica del Romancero
	 */
	private String tematica;

	/**
	 * Constructor por defecto que hereda el constructor por defecto padre
	 */
	public Romancero() {
		super();
	}

	/**
	 * Constructor con 6 parametros Crea objetos heredados del constructor de tipo
	 * AgrupacionOfical con con nombre, autor , autorMusica, autorLetra, tipo
	 * disfraz, y crea objetos tipo Romancero con tematica
	 * 
	 * @param nombre      <i>Nombre de la agrupacion</i>
	 * @param autor       <i>autor de la agrupacion</i>
	 * @param autorMusica <i>autor de la musica de la agrupacion</i>a
	 * @param autorLetra  <i>autor de la letra de la agrupacion</i>
	 * @param tipoDisfraz <i>tipo de disfraz de la agrupacion</i>
	 * @param tematica    <i> tematica del romancero </i>
	 */
	public Romancero(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz,
			String tematica) {
		super(nombre, autor, autorMusica, autorLetra, tipoDisfraz);
		setTematica(tematica);
	}

	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
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
	public String cantarPresentacion() {

		return "Cantando la presentación del Romancero del nombre" + getNombre();
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
	@Override
	public String hacerTipo() {

		return "El romancero " + getNombre() + " va de " + getTipoDisfraz();
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
		return "Amo a escuche el Romancero" + getNombre();
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
		return "Romancero " + super.toString() + ", Temática del cartelón=" + tematica;
	}
}
