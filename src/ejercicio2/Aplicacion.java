package ejercicio2;

public class Aplicacion {

	public static void main(String[] args) {
		MiArraylist<Integer> lista = new MiArraylist<Integer>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		
		for(int aux:lista){
			System.out.print(aux);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
