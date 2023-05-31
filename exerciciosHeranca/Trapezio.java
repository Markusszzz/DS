import java.util.Scanner;

public class Trapezio extends formas {

	private double trapezio;
	Trapezio(double base, double altura, double baseM, double baseG, double lados) {
		super(base, altura, baseM, baseG, lados);
		
		
		this.setBaseG(baseG);
		this.setBaseM(baseM);
		this.setAltura(altura);
		
	}
	
	void calcularArea(double base, double altura, double baseM, double baseG, double lados) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite a base maior e menor do Trapezio:");
		baseG = in.nextDouble();
		baseM= in.nextDouble();
		
		System.out.println("Digite a altura do Trapezio:");
		altura = in.nextDouble();
		
		
		this.setBaseG(baseG);
		this.setBaseM(baseM);
		this.setAltura(altura);
		
		trapezio= (altura+baseG+baseM)/2;
		 System.out.println("A area do Trapezio eh: "+trapezio);
	}

}
