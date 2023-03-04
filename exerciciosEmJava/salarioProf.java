
import java.util.*;
public class inss {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double horaAula, salario, aulas, total=0;
		System.out.println("Digite o numero de aulas dadas no mes: ");
		salario =  ler.nextDouble();
		System.out.println("Digite o valor da hora da aula: ");
		horaAula = ler.nextDouble();
		if(salario<=1212) {
			total = (salario*horaAula) - (7.5/100);
			
		}else if(salario<=2427.35) {
			total = (salario*horaAula) - (9/100);
		}else if(salario<=3641.03) {
			total = (salario*horaAula) - (12/100);
		}else if(salario<=7087.22) {
			total = (salario*horaAula) - (14/100);
		}else if(salario<=12136.79) {
			total = (salario*horaAula) - (14.5/100);
		}else if(salario<=24273.57) {
			total = (salario*horaAula) - (16.5/100);
		}else if(salario<=47333.46) {
			total = (salario*horaAula) - (19/100);
		}else if(salario>47333.46) {
			total = (salario*horaAula) - (22/100);
		}
		System.out.println("Seu salario � de: "+total);
	}

}
