package relembrandoEst;
import java.util.Scanner;
public class retangulo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double base,altura, area, perimetro;
		
		System.out.println("Digite o valor da base do ret�ngulo:");
		base = in.nextDouble();
		
		System.out.println("Digie o valor da altura do ret�ngulo");
		altura = in.nextDouble();
		
		area = base*altura;
		
		System.out.println("A area do retangulo �: " +area);
		
		perimetro= 2*(base+altura);
		System.out.println("O perimetro do retangulo �: " +perimetro);
	}		 

}
