package ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

public class MiArraylist<T> extends ArrayList<T> implements Iterable<T>{
	
	public MiArraylist(){
		super();	
	}
	
	@Override
	public Iterator<T> iterator(){
		return new Iterador<>(this);
	}
	
}
