package Logica;

public class libro {
	
	private String nombre;
	private String autor;
	private double precio;
	
	public libro() {
		
	}
	
	public libro (String nombre, String autor, double precio) {
		this.nombre = nombre;
		this.autor = autor;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "\n"
				+ "El nombre es: " + nombre +
				"\nEl autor es: " + autor +
				"\nEl precio es: " + precio +
				"\n-------------------------------";
	}

}
