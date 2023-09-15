package Logica;

public class infantil extends libro{
	
	private int cantHojas;
	
	public infantil () {
		super();
	}
	
	public infantil (String nombre,String autor,double precio,int cantHojas) {
		super(nombre,autor,precio);
		this.cantHojas = cantHojas;
	}

	public int getCantHojas() {
		return cantHojas;
	}

	public void setCantHojas(int cantHojas) {
		this.cantHojas = cantHojas;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nCantidad de hojas: " + cantHojas + "\n";
	}
}
