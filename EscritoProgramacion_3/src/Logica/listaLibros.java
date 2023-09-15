package Logica;
import java.util.ArrayList;

public class listaLibros {
	
	ArrayList<libro> lista;
	
	public listaLibros() {
		lista = new ArrayList<>();
	}
	
	public void agregar(libro a) {
		lista.add(a);
	}
	
	public void borrar (int i) {
		lista.remove(i);
	}
	
	public String toString() {
		return "\n" + lista.toString() + "\n";
	}

}
