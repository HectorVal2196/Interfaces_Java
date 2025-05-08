
public class Trapecio implements Operaciones{
	private String nombre;
	private double baseMayor;
	private double baseMenor;
	private double altura;
	private double lado1;
	private double lado2;
	private double lado3;
	private double lado4;

	public Trapecio(String nombre, double baseMayor, double baseMenor, double altura, double lado1, double lado2,
			double lado3, double lado4) {
		super();
		this.nombre = nombre;
		this.baseMayor = baseMayor;
		this.baseMenor = baseMenor;
		this.altura = altura;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
	}
	
	public double calcularArea() {
		return (getAltura()*(getBaseMayor() + getBaseMenor()))/2;
	}//CalcularArea
	public double calcularPerimetro () {
		return getLado1() + getLado2() + getLado3() + getLado4();
	}//CalcularPeremietro
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getBaseMayor() {
		return baseMayor;
	}
	public void setBaseMayor(double baseMayor) {
		this.baseMayor = baseMayor;
	}
	public Double getBaseMenor() {
		return baseMenor;
	}
	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public Double getLado1() {
		return lado1;
	}
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	public Double getLado2() {
		return lado2;
	}
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	public Double getLado3() {
		return lado3;
	}
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
	public Double getLado4() {
		return lado4;
	}
	public void setLado4(double lado4) {
		this.lado4 = lado4;
	}
	@Override
	public String toString() {
		return "Trapecio [nombre=" + nombre + ", baseMayor=" + baseMayor + ", baseMenor=" + baseMenor + ", altura="
				+ altura + ", lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + ", lado4=" + lado4 + "]";
	}

	@Override
	public Double getBase() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getLado() {
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
	
	
}//class
