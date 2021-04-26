package dominio;

public class LibroNuevoLanzamiento extends Libro {

	public LibroNuevoLanzamiento(String nombre) {
		super(nombre);
	}

	public double monto(int diasAlquiler) {
		return diasAlquiler * 3;
	}

	public boolean tieneBonus(int diasAlquiler) {
		if (diasAlquiler > 1)
			return true;
		return false;
	}
}
