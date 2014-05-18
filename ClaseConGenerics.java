package listadoEstructuras3;

import java.util.ArrayList;

/**
 * Reproduce una clase con Generics. Ll�mala ClaseConGenerics. Entrega su
 * esqueleto donde: a. Definas una variable de objeto. Ha de ser una colecci�n
 * homog�nea (del tipo parametrizado de la clase) b. Definas un constructor
 * donde instancies el atributo anterior c. Definas un m�todo metodo1 cuyo
 * par�metro sea del tipo parametrizado d. Definas un m�todo metodo2 cuyo valor
 * devuelto sea del tipo parametrizado
 * 
 * @author Mu�oz Godenir Christopher
 * @version 1.1
 */
public class ClaseConGenerics<L> {
	/**
	 * Lista parametrizada
	 */
	private ArrayList<L> arrayList;

	// M�todos get y set
	ArrayList<L> getArrayList() {
		return arrayList;
	}

	void setArrayList(ArrayList<L> arrayList) {
		this.arrayList = arrayList;
	}

	// Constructor
	public ClaseConGenerics(ArrayList<L> arrayList) {
		setArrayList(arrayList);
	}

	/**
	 * 
	 * @param tipo
	 */
	void metodo1(L elemento) {
		getArrayList().add(elemento);
	}

	/**
	 * 
	 * @param tipo
	 * @return
	 */
	L metodo2(int posicion) {
		return getArrayList().get(posicion);
	}
}
