package model;

/**
 * <h2>Se utiliza para crear integrantes</h2>
 * 
 * @author JavierPintado
 * @version 1.1
 *
 */
public class Integrante {

	/**
	 * Atributo del numero del integrante
	 */
	private Integer numeroParticipante;
	/**
	 * Atributo con el nombre del integrante
	 */
	private String nombre;
	/**
	 * Atributo con la edad del integrante
	 */
	private Integer edad;
	/**
	 * Atributo con la localidad del integrante
	 */
	private String localidad;
	/**
	 * Atributo estatico "num" que funciona como contador
	 */
	private static Integer num = 0;

	/**
	 * Constructor por defecto
	 * Aumenta el contador de numero de participantes
	 */
	public Integrante() {
		setNumeroParticipante(num++);
	}
	
	/**
	 Constructor con 4 parametros
	 * Crea objetos inetgrante, con nombre, edad y localidad
	 * @param nombre <i>Nombre del Integrante</i>
	 * @param edad <i>edad del Integrante</i>
	 * @param localidad <i>localidad del integrante</i>
	 */
	public Integrante(String nombre, Integer edad, String localidad) {
		setNumeroParticipante(num++);
		setNombre(nombre);
		setEdad(edad);
		setLocalidad(localidad);
	}

	public Integer getNumeroParticipante() {
		return numeroParticipante;
	}

	private void setNumeroParticipante(Integer numeroParticipante) {
		this.numeroParticipante = numeroParticipante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}
	
	/**
	 * Metodo que asigna la edad si es mayor de 18
	 * @param edad
	 */
	public void setEdad(Integer edad) {
		if (edad >= 18) {
			this.edad = edad;
		}

	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
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
		return "Integrante " + numeroParticipante + " Nombre=" + nombre + " Edad=" + edad + " Localidad=" + localidad;
	}

	
	
	
}
