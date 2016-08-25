package ejercicio1;

public class Aplicacion {

	public static void main(String[] args) {
		MiArraylist<String> lista = new MiArraylist<String>();
		lista.add("diego");
		lista.add("meliza");
		lista.add("Bonilla");
		lista.add("Dayana");
		lista.add("Javier");
		
		for(String s:lista){
			System.out.print(s+" ");
		}

	}

}
