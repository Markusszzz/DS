package exMatriz;
import java.util.Scanner;
public class somaMatriz {
	public static void main(String[] args) {
Scanner in = new Scanner (System.in);
		
		int i,j;
		int matriz [] [] = new int [4] [2];
		
		
		for ( i=0; i<4;i++){
			for(j=0;j<2;j++) {
				System.out.println("digite os valores que deseja fazer a soma: ");
				matriz [i][j]= in.nextInt();
				
			}
			
		}
		for (i=0; i<4;i++) {
			System.out.print((i+1)+".o linha:" +" ");
			System.out.print(matriz [i] [0]+" + "+matriz [i][1]+ " = " +(matriz [i][0]+matriz[i][1]));
		System.out.println(" ");
		
	}

	}



}

