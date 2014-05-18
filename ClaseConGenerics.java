package listadoEstructuras3;

import java.util.ArrayList;

/**
 * Reproduce una clase con Generics. Llámala ClaseConGenerics. Entrega su
 * esqueleto donde: a. Definas una variable de objeto. Ha de ser una colección
 * homogénea (del tipo parametrizado de la clase) b. Definas un constructor
 * donde instancies el atributo anterior c. Definas un método metodo1 cuyo
 * parámetro sea del tipo parametrizado d. Definas un método metodo2 cuyo valor
 * devuelto sea del tipo parametrizado
 * 
 * @author Muñoz Godenir Christopher
 * @version 1.0
 */
public class ClaseConGenerics<L> {
	/**
	 * Lista parametrizada
	 */
	private ArrayList<L> arrayList;

	// Métodos get y set
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
