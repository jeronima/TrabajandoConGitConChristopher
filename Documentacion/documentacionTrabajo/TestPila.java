package documentacionTrabajo;

/**
 * <pre>Crea una clase TestPila donde se a�aden muchos elementos de la clase creada en el mismo
 * fichero (Persona, Paciente, Cartas...) y en la que se invocan a todos los m�todos. 
 * Al final, se vac�a la pila con un bucle.</pre>
 * 
 * @author Mu�oz Godenir Christopher
 * @version 1.1
 */

public class TestPila {

	/**
	 * M�todo principal del programa 
	 * @param args argumentos
	 */
	public static void main(String[] args) {
		Pila<Paciente> pila = new Pila<Paciente>();

		pila.push(new Paciente("Pepito", "Gonzalez L�pez", "11/12/2013",
				"Sin diagnosticar"));
		pila.push(new Paciente("Mar�a", "Le�n Trujillo", "14/06/2012",
				"Gastroenteritis"));
		pila.push(new Paciente("Laura", "Mu�oz Baena", "01/01/2014",
				"Fractura en la cien"));
		pila.push(new Paciente("Fulanito", "G�mez", "12/07/2011",
				"Tendinitis de hombros"));
		pila.push(new Paciente("Adri�n", "Manche�o L�pez", "26/05/2013",
				"Insuficiencia card�aca"));

		System.out.println("Top: \n" + pila.top() + "\n");

		while (!pila.isEmpty()) {
			System.out.println("Desapilo de la pila: \n"
					+ pila.pop() + "\n");			
		}
	}
}

/**
 * Clase que describe un paciente 
 */
class Paciente {
	/**
	 * Nombre del Paciente
	 */
	private String nombre;
	/**
	 * Apellidos del Paciente
	 */
	private String apellidos;
	/**
	 * Fecha de Ingreso del Paciente
	 */
	private String fechaIngreso;
	/**
	 * Diagnostico del Paciente
	 */
	private String diagnostico;

	/**
	 * Contructor parametrizado
	 * 
	 * @param nombre Nombre del Paciente
	 * @param apellidos Apellidos del Paciente
	 * @param fechaIngreso Fecha de Ingreso del Paciente
	 * @param diagnostico Diagnostico del Paciente
	 */
	public Paciente(String nombre, String apellidos, String fechaIngreso,
			String diagnostico) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaIngreso = fechaIngreso;
		this.diagnostico = diagnostico;
	}

	@Override
	public String toString() {
		return "\nPaciente [nombre=" + nombre + ", apellidos=" + apellidos
				+ ", fechaIngreso=" + fechaIngreso + ", diagnostico="
				+ diagnostico + "]";
	}
}