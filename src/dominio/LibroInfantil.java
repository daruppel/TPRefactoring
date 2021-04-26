package dominio;

public class LibroInfantil extends Libro {
	public LibroInfantil(String nombre) {
		super(nombre);
	}

	public double monto(int diasAlquiler) {
		double monto = 1.5;
		if (diasAlquiler > 3)
			monto += (diasAlquiler - 3) * 1.5;
		return monto;
	}

	public boolean tieneBonus(int diasAlquiler) {
		return false;
	}
}
