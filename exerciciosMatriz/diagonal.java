package exMatriz;
import java.util.Scanner;
public class diagonal {

	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
		

		int i,j,lerMatriz;
		int matriz [] [] = new int [5] [5];
		

		for ( i=0; i<5;i++){
			for(j=0;j<5;j++) {
				System.out.println("digite os números da matriz: ");
				     lerMatriz= in.nextInt();
				   if(i==j) {
					   matriz[i][j] = lerMatriz;
				   }
					
				}
				
			}
				
				
				
		
		for( i=0; i<5;i++) {
			for(j=0;j<5;j++) {
				System.out.print("["+ matriz[i][j]+"]");
				
			}
			System.out.println();
		}
			
			
		

	}
		
		
}

