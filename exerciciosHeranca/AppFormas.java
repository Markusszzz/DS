import java.util.Scanner;

public class AppFormas {
	 
	public static void main(String[] args) {
	
		int forma;
		String resposta;
		
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("Digite a forma que deseja saber a area: \n1-Quadrado\n2-Retangulo\n3-Triangulo\n4-Trapezio");
			forma = in.nextInt();
			
			if(forma==1) {
				Quadrado quadrado = new Quadrado(0, 0, 0, 0, 0);
				quadrado.calcularArea(0, 0, 0, 0, 0);
			}else if(forma==2) {
				Retangulo retangulo = new Retangulo(0, 0, 0, 0, 0);
				retangulo.calcularArea(0, 0, 0, 0, 0);
			}else if(forma==3) {
				Triangulo triangulo = new Triangulo(0, 0, 0, 0, 0);
				triangulo.calcularArea(0, 0, 0, 0, 0);
			}else if(forma==4) {
				Trapezio trapezio = new Trapezio(0, 0, 0, 0, 0);
				trapezio.calcularArea(0, 0, 0, 0, 0);
			}
			
			System.out.println("Deseja continuar a operacao?Sim ou Nao?");
			resposta = in.next();
		}while(resposta.equalsIgnoreCase("sim"));
		System.out.println("Fim das operacoes");
	}

}
