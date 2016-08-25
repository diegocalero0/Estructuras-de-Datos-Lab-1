package ejercicio1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Iterador<T> implements Iterator<T>{

	private int indice;
	private ArrayList<T> miArraylist;
	private boolean isBack;
	
	public Iterador(ArrayList<T> lista) {
		miArraylist=lista;
		indice=miArraylist.size();
		isBack=true;
	}
	
	@Override
	public boolean hasNext() {
		if(isBack){
			if(indice>0){
				return true;
			}else{
				indice=1;
				isBack=false;
				return true;
			}
		}else{
			if(indice<=miArraylist.size()){
				return true;
			}else{
				return false;
			}
		}
	}

	@Override
	public T next() {
		T aux=null;
		if(miArraylist.size()>0){
			aux=miArraylist.get(indice-1);
			if(isBack){
				indice--;
			}else{
				indice++;
			}
		}
		return aux;
	}

}
