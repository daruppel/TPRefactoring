package dominio;

public class LibroRegular extends Libro {

	public LibroRegular(String nombre) {
		super(nombre);
	}

	public double monto(int diasAlquiler) {
		double monto = 2;
		if (diasAlquiler > 2)
			monto += (diasAlquiler - 2) * 1.5;
		return monto;
	}

	public boolean tieneBonus(int diasAlquiler) {
		return false;
	}
}
