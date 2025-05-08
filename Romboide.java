
public class Romboide implements Operaciones {
	private String nombre;
	private double base;
	private double altura;

	public Romboide(String nombre, double base, double altura) {
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
	
	@Override
	public String toString() {
		return "Romboide [nombre=" + nombre + ", base=" + base + ", altura=" + altura + "]";
	}

	@Override
	public Double getLado() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getLado1() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getLado2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getLado3() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getLado4() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getDiagonalMayor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getDiagonalMenor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getBaseMenor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getBaseMayor() {
		// TODO Auto-generated method stub
		return null;
	}
}
