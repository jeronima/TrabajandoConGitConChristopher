package documentacionTrabajo;

import java.util.ListIterator;

import utiles.Menu;
import utiles.Teclado;

/**
 * <pre>Crea una clase TestPila donde se a�aden muchos elementos de la clase creada en el mismo
 * fichero (Persona, Paciente, Cartas...) y en la que se invocan a todos los m�todos. 
 * Incluye una interfaz de texto para el usuario.
 * Al final, se vac�a la pila con un bucle.
 * </pre>
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
	/**
	 * Realiza una acci�n seg�n la entrada introducida por el usuario.
	 * <ol>
	 * <li>A�adir Paciente </li>
	 * <li>Mostrar �ltimo paciente, comprobando si hay pacientes </li>
	 * <li>Eliminar el �ltimo paciente </li>
	 * <li>Mostrar pacientes </li>
	 * <li>Salir </li>
	 * </ol>
	 * En las opciones 2, 3 y 4 se comprueba si hay pacientes.
	 * @param pila Pila consultada
	 * @param opcion Opcion escogida por el usuario
	 */
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
		
		default:
			System.out.println("Error inesperado");
		}
	}
	
	/**
	 * M�todo principal del programa 
	 * @param args
	 */
	public static void main(String[] args) {
		Menu menu = new Menu(new String[] { "A�adir paciente",
				"Mostrar �ltimo paciente", "Eliminar el �ltimo paciente",
				"Mostrar pacientes", "Salir" });

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
