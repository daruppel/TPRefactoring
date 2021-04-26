package dominio;

public class Alquiler {
	private Libro libro;
	private int diasAlquilados;

	public Alquiler(Libro libro, int diasAlquilados) {
		this.libro = libro;
		this.diasAlquilados = diasAlquilados;
	}

	public double costo() {
		return this.libro.monto(this.diasAlquilados);
	}

	public int puntosAlquiler() {
		int puntosAlquiler = 0;
		if (this.libro.tieneBonus(this.diasAlquilados)) {
			puntosAlquiler++;
		}
		return puntosAlquiler;
	}
}
