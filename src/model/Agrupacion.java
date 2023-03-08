package model;

/**
 * <h2>Clase Abstracta Agrupacion con la interfaz Comprable, se utiliza para 
 * crear agrupaciones</h2> 
 * @author JavierPintado
 * @version 1.1
 *
 */
public abstract class Agrupacion implements Comparable<Agrupacion> {
	/**
	 * Atributo nombre de la agrupacion
	 */
	private String nombre;
	/**
	 * Atributo autor de la agrupacion
	 */
	private String autor;
	/**
	 * Atributo autor de la musica de la agrupacion
	 */
	private String autorMusica;
	/**
	 * Atributo autor de la letra de la agrupacion
	 */
	private String autorLetra;
	/**
	 * Atributo del tipo de disfraz de la agrupacion
	 */
	private String tipoDisfraz;
	private Integer agrupacionesTotales;
	private static Integer cont = 1;
	
	/**
	 * Constructor por defecto
	 * Aumenta el contador de las agrupaciones totales
	 */
	public Agrupacion() {
		setAgrupacionesTotales(cont++);
	}
	
	/**
	 * Constructor con 5 parametros
	 * Crea objetos agrupacion, con nombre, autor , autorMusica, autorLetra y el tipo disfraz
	 * @param nombre <i>Nombre de la agrupacion</i>
	 * @param autor <i>autor de la agrupacion</i>
	 * @param autorMusica <i>autor de la musica de la agrupacion</i>
	 * @param autorLetra <i>autor de la letra de la agrupacion</i>
	 * @param tipoDisfraz <i>tipo de disfraz de la agrupacion</i>
	 */
	public Agrupacion(String nombre, String autor, String autorMusica, String autorLetra, String tipoDisfraz ) {
		setAgrupacionesTotales(cont++);
		setNombre(nombre);
		setAutor(autor);
		setAutorMusica(autorMusica);
		setAutorLetra(autorLetra);
		setTipoDisfraz(tipoDisfraz);
	}
	
	//Metodos publicos
	
	/**
	 * Metodo abstracto que heredan todas las clases hijas
	 * 
	 * @return <ul>
	 * 		   		<li>Devuelve una cadena de caracteres</li>
	 * 		   </ul>
	 */
	public abstract String hacerTipo();
	
	/**Metodo abstracto que heredan todas las clases hijas
	 * 
	 * @return <ul>
	 * 		   		<li>Devuelve una cadena de caracteres</li>
	 * 		   </ul>
	 */
	public abstract String cantarPresentacion();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAutorMusica() {
		return autorMusica;
	}

	public void setAutorMusica(String autorMusica) {
		this.autorMusica = autorMusica;
	}

	public String getAutorLetra() {
		return autorLetra;
	}

	public void setAutorLetra(String autorLetra) {
		this.autorLetra = autorLetra;
	}

	public String getTipoDisfraz() {
		return tipoDisfraz;
	}

	public void setTipoDisfraz(String tipoDisfraz) {
		this.tipoDisfraz = tipoDisfraz;
	}
	
	

	public Integer getAgrupacionesTotales() {
		return agrupacionesTotales;
	}

	public void setAgrupacionesTotales(Integer agrupacionesTotales) {
		this.agrupacionesTotales = agrupacionesTotales;
	}
	
	/**
	 * Metodo implementado de la interfaz Comparable para ordenar por defecto por nombre
	 * @return <ul>
	 * 		   		<li>Comparacion del nombre para su ordenacion</li>
	 * 		   </ul>
	 */
	@Override
	public int compareTo(Agrupacion o) {
		
		return this.getNombre().compareTo(o.getNombre()) ;
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
		return "Nombre=" + nombre + ", Autor=" + autor + ", AutorM=" + autorMusica + ", AutorL=" + autorLetra + ", Tipo=" + tipoDisfraz;
	}
	
	
}
