
public class Triangulo implements Operaciones {
	private String nombre;
	private double base;
	private double altura;
	private double lado;
	
	public Triangulo(String nombre, double base, double altura, double lado) {
		super();
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
		this.lado = lado;
	}//constructor
	
	public double calcularArea() {
		return (getBase()*getAltura())/2;
	}//CalcularArea
	public double calcularPerimetro () {
		return getLado()*3;
	}//CalcularPeremietro

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public Double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}

	
	@Override
	public String toString() {
		return "Triangulo [nombre=" + nombre + ", base=" + base + ", altura=" + altura + ", lado=" + lado + "]";
	}


	
}//ClassTriangulo
