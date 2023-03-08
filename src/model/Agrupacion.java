package model;

/**
 * <h2>Clase Abstracta Agrupacion con la interfaz Comprable, se utiliza para 
 * crear agrupaciones</h2> 
 * @author UsuarioM
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
	

	public Agrupacion() {
		setAgrupacionesTotales(cont++);
	}
	
	
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
	 * @see Agrupacion 
	 * @return <ul>
	 * 		   		<li>Devuelve una cadena de caracteres</li>
	 * 		   </ul>
	 */
	public abstract String hacerTipo();
	
	/**
	 * 
	 * @return
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

	@Override
	public int compareTo(Agrupacion o) {
		
		return this.getNombre().compareTo(o.getNombre()) ;
	}
	
	@Override
	public String toString() {
		return "Nombre=" + nombre + ", Autor=" + autor + ", AutorM=" + autorMusica + ", AutorL=" + autorLetra + ", Tipo=" + tipoDisfraz;
	}
	
	
}
