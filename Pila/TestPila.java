package listadoEstructuras3;

/**
 * Para ello, crea una clase TestPila donde se a�adan muchos elementos de una
 * clase creada en el mismo fichero (Persona, Paciente, Cartas...) y se invoquen
 * a todos los m�todos. Al final, vac�a la pila con un bucle de este estilo:
 * while (!pila.IsEmpty()) System.out.println("Desapilo de la pila: " +
 * p.pop());
 * 
 * @author Mu�oz Godenir Christopher
 * @version 1.1
 */

public class TestPila {

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
//		if(pila.pop() == null)
//			System.out.println("Pila vac�a");
//		pila.pop();
	}
}

class Paciente {
	private String nombre;
	private String apellidos;
	private String fechaIngreso;
	private String diagnostico;

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