import java.util.Scanner;
public class Quadrado extends formas{
	 private double quadrado;

	Quadrado(double base, double altura, double baseM, double baseG, double lados) {
		super(base, altura, baseM, baseG, lados);
		
		
		this.setLados(lados);
		
		
	}

	
	void calcularArea(double base, double altura, double baseM, double baseG, double lados) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite os lados do quadrado:");
		lados = in.nextDouble();
		this.setLados(lados);
		
		quadrado = lados*lados;
		 System.out.println("A area do quadrado eh: "+quadrado);
		
	}
	
	

	

}
