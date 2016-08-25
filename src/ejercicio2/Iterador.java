package ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterador<T> implements Iterator<T> {
	private int indice;
	private ArrayList<T> lista;
	public Iterador(ArrayList<T> lista) {
		this.lista=lista;
		indice=0;
	}
	
	@Override
	public boolean hasNext() {
		if(indice==lista.size()){
			indice=0;
		}
		return true;
	}

	@Override
	public T next() {
		T aux=null;
		if(lista.size()>0){
			aux=lista.get(indice);
			indice++;
		}
		return aux;
	}
	
}
