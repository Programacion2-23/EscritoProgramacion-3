package Consola;

import Logica.infantil;
import Logica.libro;
import Logica.listaLibros;

public class PruebaListaLibros {

	public static void main(String[] args) {
		
		libro libro = new libro("Harry Potter", "Pepito", 2000); 
		infantil libroInfantil = new infantil("El Asesinato", "Gerardito", 3000, 400);
		infantil libroInfantil2 = new infantil("El granjero", "roberto", 500, 300);
		listaLibros listado = new listaLibros();

		listado.agregar(libro);
		listado.agregar(libroInfantil);
		listado.agregar(libroInfantil2);
		
		System.out.println(listado.toString());
		
		System.out.println("Borrado...");
		listado.borrar(2);
		System.out.println(listado.toString());
	}
}
