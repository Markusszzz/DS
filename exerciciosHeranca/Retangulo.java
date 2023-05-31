import java.util.Scanner;
public class Retangulo extends formas {
	private double retangulo;
	Retangulo(double base, double altura, double baseM, double baseG, double lados) {
		super(base, altura, baseM, baseG, lados);
		
		
		
		this.setBase(base);
		this.setAltura(altura);
		
	}
	
	void calcularArea(double base, double altura, double baseM, double baseG, double lados) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite a base e altura do Retangulo:");
		base = in.nextDouble();
		altura = in.nextDouble();
		
		this.setBase(base);
		this.setAltura(altura);
		
		retangulo = base*altura;
		 System.out.println("A area do Retangulo eh: "+retangulo);
		
	}

}
