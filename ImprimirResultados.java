
public class ImprimirResultados {
	
	public static void imprimirCalculos(Operaciones figura) {
		System.out.println(figura);
		System.out.println("+-------------------------------");
		System.out.println("| El área de [" + figura.getNombre() + "]");
		System.out.println("| es " + figura.calcularArea());
		System.out.println("| El perímetro de [" + figura.getNombre() + "]");
		System.out.println("| es " + figura.calcularPerimetro());
		System.out.println("+-------------------------------");
	}
}
