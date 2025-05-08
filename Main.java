
public class Main {

	public static void main(String[] args) {
		Triangulo t=new Triangulo ("Triángulo T",200 , 100 ,150);
		Cuadrado  c= new Cuadrado ("Cuadradito", 25);
		
		ImprimirResultados.imprimirCalculos(t);
		ImprimirResultados.imprimirCalculos(c);

	}//main

	
}//classMain
