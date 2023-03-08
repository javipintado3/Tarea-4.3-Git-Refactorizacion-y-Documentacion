package model;


/**
 * Clase abstracta que hereda de la clase Agrupacion, se
 * utiliza para crear agrupaciones oficiales
 * @author JavierPintado
 * @version 1.1
 *
 */
public abstract class AgrupacionOficial extends Agrupacion  {

	/**
	 * Constante que contiene el maximo de integrantes 
	 * de la agrupacion oficial
	 */
	private final int MAX_INT = 10;
	/**
	 * Atributo contador de Integrantes
	 */
	private Integer contIntegrantes = 0;
	/**
	 * Atributo puntos obtenidos de las Agrupaciones Oficiales
	 */
	private Integer puntosObt;
	/**
	 * Atributo integrante de las Agrupaciones Oficiales
	 */
	private Integrante[] integrantes;
	
	/**
	 * Constructor por defecto
	 * Hereda el constructor por defecto de la clase padre
	 * y pone los integrentas al maximo de integrantes                            
	 */
	public AgrupacionOficial() {
		super();
		integrantes = new Integrante[MAX_INT];
	}
	/**
	 * Constructor con 6 parametros
	 * Crea objetos heredados del constructor de tipo Agrupacion con
	 * con nombre, autor , autorMusica, autorLetra y el tipo disfraz, 
	 * y crea objetos tipo AgrupacionOficial con los puntos obtenidos
	 * @param nombre <i>Nombre de la agrupacion</i>
	 * @param autor <i>autor de la agrupacion</i>
	 * @param autorMusica <i>autor de la musica de la agrupacion</i>a
	 * @param autorLetra <i>autor de la letra de la agrupacion</i>
	 * @param tipoDisfraz <i>tipo de disfraz de la agrupacion</i>
	 * @param puntosObt <i>puntos obtenidos de agrupacion oficial </i>
	 */
	public AgrupacionOficial(String nombre, String autor, String autorMusica, String autorLetra, String tipo, Integer puntosObt) {
		super(nombre, autor, autorMusica, autorLetra, tipo);
		setPuntosObt(puntosObt);
		integrantes = new Integrante[MAX_INT];
	}
	
	
	
	public Integer getContIntegrantes() {
		return contIntegrantes;
	}

	public void setContIntegrantes(Integer contIntegrantes) {
		this.contIntegrantes = contIntegrantes;
	}

	public abstract String caminitoDelFalla();


	public Integer getPuntosObt() {
		return puntosObt;
	}


	public void setPuntosObt(Integer puntosObt) {
		this.puntosObt = puntosObt;
	}


	public Integrante[] getIntegrantes() {
		return integrantes;
	}


	public void setIntegrantes(Integrante[] integrantes) {
		this.integrantes = integrantes;
	}
	
	/**
	 * Metodo para insertar un integrante 
	 * @param i <li>Objeto tipo integrante </li>
	 * @return <ul>
	 * 		   		<li>true: si se a insertado un integrante</li>
	 * 				<li>false: si no se a insertado un integrante</li>
	 * 		   </ul>
	 */
	public boolean insertarIntegrante(Integrante i) {
		boolean added = false;
		
		for (int x = 0; x < integrantes.length; x++) {
			if (integrantes[x] == null)
			integrantes[x] = i;
			added = true;
			break;
		} 
		
		return added;
	}
	
	/**
	 * Metodo para eliminar un integrante
	 * @param i <li>Objeto tipo integrante </li>
	 * @return <ul>
	 * 		   		<li>true: si se a eliminado un integrante</li>
	 * 				<li>false: si no se a eliminado un integrante</li>
	 * 		   </ul>
	 */
	public boolean eliminarIntegrante(Integrante i) {
			
		boolean delete = false;
			
		for (int x = 0; x < integrantes.length; x++) {
				if (integrantes[x] != null &&  integrantes[x].equals(i))
				integrantes[x] = null;
				delete = true;
				break;
		} 
			
		return delete;
	}
	
	/**
	 * Metodo para listar los integrantes
	 * 
	 * @return <ul>
	 * 		   		<li>Devuelve un String con todos los integrantes listados</li>
	 * 		   </ul>
	 */
	public String listadoIntegrante() {
		String texto = "";
		for (int i = 0; i < integrantes.length; i++) {
			if (integrantes[i] != null) {
				texto += integrantes[i];
			}
		}
		return texto;
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
		return super.toString() + ", Puntos=" + puntosObt + ", integrantes=" + listadoIntegrante();
	}
}
