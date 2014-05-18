package listadoEstructuras3;

import java.util.ListIterator;

import utiles.Menu;
import utiles.Teclado;

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

public class TestPilaConMenu {

	/**
	 * Muestra los pacientes de la pila
	 * @param pila
	 */
	private static void mostrarPacientes(Pila<Paciente> pila) {
		ListIterator<Paciente> iterator = pila.getArrayList().listIterator(
				pila.getArrayList().size());
		while (iterator.hasPrevious())
			System.out.println(iterator.previous().toString());
	}

	private static void realizarAccion(Pila<Paciente> pila, int opcion) {
		switch (opcion) {
		case 1:
			pila.push(new Paciente(Teclado
					.leerCadena("Introduce el nombre del paciente: "),
					Teclado.leerCadena("Introduce los apellidos: "),
					Teclado.leerCadena("Introduce la fecha de ingreso: "),
					Teclado.leerCadena("Introduce el diagnostico: ")));
			System.out.println(pila.top().toString()
					+ "\nA�adido con �xito\n");

		case 2:
			if (!pila.isEmpty()) {
				System.out.println(pila.top().toString());
			} else
				System.out.println("No hay pacientes");
			break;

		case 3:
			if (!pila.isEmpty()) {
				System.out.println(pila.top().toString()
						+ "\nHa sido eliminado");
				pila.pop();
			} else
				System.out.println("No hay pacientes");
			break;
		case 4:
			if (!pila.isEmpty())
				mostrarPacientes(pila);
			else
				System.out.println("No hay pacientes");
			break;
		case 5:
			System.out.println("�Adios!");
			break;
		case 6:
			System.out.println(pila);
			break;
		default:
			System.out.println("Error inesperado");
		}
	}
	
	/**
	 * M�todo principal del programa
	 * @param args
	 */
	public static void main(String[] args) {
		Menu menu = new Menu(new String[] { "1) A�adir paciente",
				"2) Mostrar �ltimo paciente", "3) Eliminar el �ltimo paciente",
				"4) Mostrar pacientes", "5) Salir", "6) Mostrar pila" });

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

		int opcion;

		do {
			menu.mostrarInstrucciones();
			menu.mostrar();
			opcion = menu.getSeleccion();
			realizarAccion(pila, opcion);
		} while (opcion != 5);
	}
}
