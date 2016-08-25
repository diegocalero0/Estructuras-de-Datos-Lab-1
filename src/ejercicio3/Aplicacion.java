package ejercicio3;

public class Aplicacion {

	public static void main(String[] args) {
		MiArraylist<Integer> lista = new MiArraylist<Integer>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		lista.add(14);
		lista.add(12);
		lista.add(8);
		lista.add(7);
		lista.add(9);
		lista.add(21);
		lista.add(23);
		lista.add(29);
		lista.add(31);
		lista.add(37);
		lista.add(63);
		lista.add(11);
		lista.add(1);
		lista.add(9);
		lista.add(10);
		
		for(int aux:lista){
			System.out.print(aux+" ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
