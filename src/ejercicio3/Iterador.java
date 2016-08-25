package ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterador<Integer> implements Iterator<Integer> {
	private int indice;
	private ArrayList<Integer> lista;
	public Iterador(ArrayList<Integer> lista) {
		this.lista=lista;
		indice=0;
	}
	
	@Override
	public boolean hasNext() {
		for(int i=indice;i<lista.size();i++){
			if(esPrimo((int) lista.get(i))){
				indice=i;
				return true;
			}
		}
		return false;
	}

	@Override
	public Integer next() {
		Integer aux=null;
		if(lista.size()>0){
			aux=lista.get(indice);
			indice++;
		}
		return aux;
	}
	
	public boolean esPrimo(int a){
		for(int i=2;i<=Math.sqrt(a);i++){
			if(a%i==0){
				return false;
			}
		}
		return true;
	}
	
}
