package model;

import java.util.Arrays;

/**
 * <h2>Clase que hereda de la clase AgrupacionOficial, se utiliza para crear
 * Comparsas</h2>
 * 
 * @author JavierPintado
 * @version 1.1
 */
public class Comparsa extends AgrupacionOficial {

	/**
	 * Atributo empresa Atezzo
	 */
	private String empresaAtezzo;

	/**
	 * Constructor por defecto que hereda el constructor por defecto padre
	 */
	public Comparsa() {
		super();
	}

	/**
	 * Constructor con 7 parametros Crea objetos heredados del constructor de tipo
	 * AgrupacionOfical con con nombre, autor , autorMusica, autorLetra, tipo
	 * disfraz, puntos obtenidos y crea objetos tipo Comparsa con empresaAtezzo
	 * 
	 * @param nombre        <i>Nombre de la agrupacion</i>
	 * @param autor         <i>autor de la agrupacion</i>
	 * @param autorMusica   <i>autor de la musica de la agrupacion</i>a
	 * @param autorLetra    <i>autor de la letra de la agrupacion</i>
	 * @param tipoDisfraz   <i>tipo de disfraz de la agrupacion</i>
	 * @param puntosObt     <i>puntos obtenidos de agrupacion oficial </i>
	 * @param empresaAtezzo <i> nombre de la empresa Atezzo </i>
	 */
	public Comparsa(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz,
			Integer puntosObt, String empresaAtezzo) {
		super(nombre, autor, autorMusica, autorLetra, tipoDisfraz, puntosObt);
		setEmpresaAtezzo(empresaAtezzo);
	}

	public String getEmpresaAtezzo() {
		return empresaAtezzo;
	}

	public void setEmpresaAtezzo(String empresaAtezzo) {
		this.empresaAtezzo = empresaAtezzo;
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
		return "Comparsa " + super.toString() + ", Empresa del atrezzo=" + empresaAtezzo;
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

		return "Cantando la presentación de la Comparsa del nombre" + getNombre();
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

		return "La comparsa " + getNombre() + " va de " + getTipoDisfraz();
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

		return "La comparsa" + getNombre() + " va caminito del Falla";
	}

}
