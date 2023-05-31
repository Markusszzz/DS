import java.util.Scanner;

public class Triangulo extends formas{
	public double triangulo;
	Triangulo(double base, double altura, double baseM, double baseG, double lados) {
		super(base, altura, baseM, baseG, lados);
		
		
		this.setBase(base);
		this.setAltura(altura);
		
	}
	
	void calcularArea(double base, double altura, double baseM, double baseG, double lados) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite a base e altura do Triangulo:");
		base = in.nextDouble();
		altura = in.nextDouble();
		
		this.setBase(base);
		this.setAltura(altura);
		
		triangulo = (base+altura)/2;
		 System.out.println("A area do Triangulo eh: "+triangulo);
	}

}
