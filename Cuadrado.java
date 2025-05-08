
public class Cuadrado implements Operaciones {
	private String nombre;
	private double lado;

	public Cuadrado(String nombre, double lado) {
		super();
		this.nombre = nombre;
		this.lado = lado;
	}
	
	public double calcularArea() {
		return getLado()*getLado();
	}//CalcularArea
	public double calcularPerimetro () {
		return getLado()*4;
	}//CalcularPeremietro

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	@Override
	public String toString() {
		return "Cuadrado [nombre=" + nombre + ", lado=" + lado + "]";
	}



}
