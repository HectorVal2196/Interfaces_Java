
public class Rectangulo {
	private String nombre;
	private double base;
	private double altura;

	public Rectangulo(String nombre, double base, double altura) {
		super();
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
	}
	
	public double calcularArea() {
		return getBase()*getAltura();
	}//CalcularArea
	public double calcularPerimetro () {
		return (getBase()*2) + (getAltura()*2);
	}//CalcularPeremietro

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Rectangulo [nombre=" + nombre + ", base=" + base + ", altura=" + altura + "]";
	}
	
	
}//class
