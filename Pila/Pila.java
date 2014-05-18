package listadoEstructuras3;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Crea una clase gen�rica Pila (debe de aceptar cualquier tipo de objeto
 * concreto, utiliza generics). Recuerda que has de evitar la interacci�n con el
 * usuario dentro de Pila. Implementa las operaciones b�sicas de una estructura
 * de datos pila. Una pila es una estructura LIFO donde el �ltimo elemento en
 * entrar es el primero en salir. Un ejemplo b�sico de pila es la forma de
 * almacenamiento de procesos en la memoria. Las operaciones a implementar son:
 * a. Crear una pila. b. Introducir elemento en la pila (apilar o push) c. Sacar
 * elemento de la pila (extraer o pop) d. Cima de la pila (devuelve el elemento
 * de la cima de la pila o top) Implementa los m�todos necesarios, y recuerda
 * hacer las pruebas precisas.
 * 
 * @author Mu�oz Godenir Christopher
 * @version 1.1
 */
public class Pila<L> {
	/**
	 * Colecci�n de elementos homog�neos del tipo parametrizado en la clase
	 */
	private ArrayList<L> arrayList;

	// M�todos get y set
	ArrayList<L> getArrayList() {
		return arrayList;
	}

	@Override
	public String toString() {
		StringBuilder cadena = new StringBuilder("");
		ListIterator<L> iterator = getArrayList().listIterator(
				getArrayList().size());
		while (iterator.hasPrevious())
			cadena.append(iterator.previous());		
		
		return cadena.toString();
	}

	private void setArrayList(ArrayList<L> arrayList) {
		this.arrayList = arrayList;
	}

	// Constructor
	public Pila() {
		setArrayList(new ArrayList<L>());
	}

	/**
	 * A�ade un elemento en la cima de la pila
	 * 
	 * @param elemento
	 *            El elemento a a�adir
	 */
	void push(L elemento) {
		getArrayList().add(elemento);
	}

	/**
	 * Eliminar el elemento que hay en la cima de la pila
	 */
	L pop() {
		if(getArrayList().isEmpty())
			return null;
		
		return getArrayList().remove(getArrayList().size() - 1);
	}

	/**
	 * Muestra un mensaje antes de elimir el elemento que hay en la cima de la
	 * pila
	 * 
	 * @param string
	 *            El mensaje a mostrar
	 */
	L pop(String string) {
		System.out.println(string);
		return pop();
	}

	/**
	 * Devuelve el elemento de la cima de la pila
	 * 
	 * @return El elemento de la cima de la pila
	 */
	L top() {
		if(getArrayList().isEmpty())
			return null;
		
		return getArrayList().get(getArrayList().size() - 1);
	}

	/**
	 * Devuelve True si la pila est� vac�a
	 * 
	 * @return Si la pila est� vac�a o no
	 */
	boolean isEmpty() {
		return getArrayList().isEmpty();
	}
}
