
import java.util.*;
public class vetor {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		int i, a[], b[], c[];
		final int TAM=10;
		a = new int[TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º Numero do Vetor A ");			
			a[i] = ler.nextInt();
		
					
	}
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º Numero do Vetor B ");			
			b[i] = ler.nextInt();
		}
		for(i=0; i<TAM; i++) {
		c[i] = a[i] + b[i];
	
		}
		System.out.println("\nC = ");
		for(i=0; i<TAM; i++) {
			System.out.println(c[i]+"");
		}
		}
			
		
}

