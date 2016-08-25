package ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

public class MiArraylist<T> extends ArrayList<T> implements Iterable<T>{

	public MiArraylist(){
		super();
	}
	
	@Override
	public Iterator iterator(){
		return new Iterador<>(this);
	}
	
}
