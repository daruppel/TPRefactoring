package dominio;

public abstract class Libro {
	private String nombre;

	public Libro(String nombre) {
		this.nombre = nombre;
	}

	public abstract double monto(int diasAlquier);

	public abstract boolean tieneBonus(int diasAlquier);

	public String nombre() {
		return nombre;
	}

}
