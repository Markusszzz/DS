import java.util.Scanner;
public class jogovelha {

	public static void main(String[] args) {
		int pos=0 , n=0;
		String linha1, linha2,linha3,coluna1,coluna2,coluna3,diagonal1,diagonal2;
		String s;
		
		//Instnciar o objeto Scanner
		Scanner input = new Scanner(System.in);
		
		//Instanciando uma Matriz
		String m[][] = new String[3][3];
		
		//cordenada linha 3 , posições 7,8 e 9
		m[0][0]= "7"; //cordenadas (0,2)
		m[0][1]= "8"; //cordenadas (1,2)
		m[0][2]= "9"; //cordenadas (2,2)
		
		//cordenada linha 2 , posições 4,5 e 6
		m[1][0]= "4"; //cordenadas (0,1)
		m[1][1]= "5"; //cordenadas (1,1)
		m[1][2]= "6"; //cordenadas (2,1)
		
		//cordenada linha 1 , posições 1,2 e 3
		m[2][0]= "1"; //cordenadas (0,0)
		m[2][1]= "2"; //cordenadas (1,0)
		m[2][2]= "3"; //cordenadas (2,0)
		
		//aviso para o ususario
		System.out.println(" o jogo ira começar");
		
		//exibindo as posições para o usuario
		System.out.println("\n" +
		m[0][0] +"\t"+ m[0][1]+"\t"+ m[0][2] +"\n"+"\n"+
		m[1][0] +"\t"+ m[1][1]+"\t"+ m[1][2] +"\n"+"\n"+
		m[2][0] +"\t"+ m[2][1]+"\t"+ m[2][2]);
		
		System.out.println("digite a posição desejada: ");
		
		//formas de ganhar o jogo
		while(n <=9) {
			linha1 = m[0][0] + m[0][1] + m[0][2];
			linha2 = m[1][0] + m[1][1] + m[1][2];
			linha3 = m[2][0] + m[2][1] + m[2][2];
			
			coluna1 = m[0][0] + m[1][0] + m[2][0];
			coluna2 = m[0][1] + m[1][1] + m[2][1];
			coluna3 = m[0][2] + m[1][2] + m[2][2];
			
			diagonal1 = m[0][0] + m[1][1] + m[2][2];
			diagonal2 = m[0][2] + m[1][1] + m[2][0];
			
			//condições do jogo da velha: vencedor ou empate
			if(linha1.equals("XXX")|| linha2.equals("XXX")|| linha3.equals("XXX")||
					coluna1.equals("XXX")|| coluna2.equals("XXX")|| coluna3.equals("XXX")||
					diagonal1.equals("XXX")|| diagonal2.equals("XXX")){
				System.out.println("\n X venceu");
				break;
			}
			if(linha1.equals("OOO")|| linha2.equals("OOO")|| linha3.equals("OOO")||
					coluna1.equals("OOO")|| coluna2.equals("OOO")|| coluna3.equals("OOO")||
					diagonal1.equals("OOO")|| diagonal2.equals("OOO")){
				System.out.println("\n O venceu");
				break;
			}
			
			//definindo de qual jogador é a vez
			if(n % 2==0) {
				s = "X";
			} else {
				s = " O";
			}
			
			//caso tena sido relizadas a9 jogadas no jogo , o jogo deu velha
			if(n > 8 ) {
				System.out.println("VELHA");
				break;
			// senão o jogo continua
			}else {
				pos = input.nextInt();
			}
			
			//marcando as jogadas do usuario
			if(pos == 1 && (m[2][0].equals("1"))) {
				m[2][0] = s;
			//exibindo as posições para o usuario
				System.out.println("\n"+
				m[0][0] +"\t"+ m[0][1]+"\t"+ m[0][2] +"\n"+"\n"+
				m[1][0] +"\t"+ m[1][1]+"\t"+ m[1][2] +"\n"+"\n"+
				m[2][0] +"\t"+ m[2][1]+"\t"+ m[2][2]);
				n++;
				continue;
			}
			
			if(pos == 2 && (m[2][1].equals("2"))) {
				m[2][1]=s;
			//exibindo as posições para o usuario
				System.out.println("\n" +
				m[0][0] +"\t"+ m[0][1]+"\t"+ m[0][2] +"\n"+"\n"+
				m[1][0] +"\t"+ m[1][1]+"\t"+ m[1][2] +"\n"+"\n"+
				m[2][0] +"\t"+ m[2][1]+"\t"+ m[2][2]);
				n++;
				continue;
			}
			
			if(pos == 3 && (m[2][2].equals("3"))) {
				m[2][2]=s;
			//exibindo as posições para o usuario
				System.out.println("\n" +
				m[0][0] +"\t"+ m[0][1]+"\t"+ m[0][2] +"\n"+"\n"+
				m[1][0] +"\t"+ m[1][1]+"\t"+ m[1][2] +"\n"+"\n"+
				m[2][0] +"\t"+ m[2][1]+"\t"+ m[2][2]);
				n++;
				continue;
			}
			
			if(pos == 4 && (m[1][0].equals("4"))) {
				m[1][0]=s;
			//exibindo as posições para o usuario
				System.out.println("\n" +
				m[0][0] +"\t"+ m[0][1]+"\t"+ m[0][2] +"\n"+"\n"+
				m[1][0] +"\t"+ m[1][1]+"\t"+ m[1][2] +"\n"+"\n"+
				m[2][0] +"\t"+ m[2][1]+"\t"+ m[2][2]);
				n++;
				continue;
			}
			
			if(pos == 5 && (m[1][1].equals("5"))) {
				m[1][1]=s;
			//exibindo as posições para o usuario
				System.out.println("\n" +
				m[0][0] +"\t"+ m[0][1]+"\t"+ m[0][2] +"\n"+"\n"+
				m[1][0] +"\t"+ m[1][1]+"\t"+ m[1][2] +"\n"+"\n"+
				m[2][0] +"\t"+ m[2][1]+"\t"+ m[2][2]);
				n++;
				continue;
			}
			
			if(pos == 6 && (m[1][2].equals("6"))) {
				m[1][2]=s;
			//exibindo as posições para o usuario
				System.out.println("\n" +
				m[0][0] +"\t"+ m[0][1]+"\t"+ m[0][2] +"\n"+"\n"+
				m[1][0] +"\t"+ m[1][1]+"\t"+ m[1][2] +"\n"+"\n"+
				m[2][0] +"\t"+ m[2][1]+"\t"+ m[2][2]);
				n++;
				continue;
			}
			
			if(pos == 7 && (m[0][0].equals("7"))) {
				m[0][0]=s;
			//exibindo as posições para o usuario
				System.out.println("\n" +
				m[0][0] +"\t"+ m[0][1]+"\t"+ m[0][2] +"\n"+"\n"+
				m[1][0] +"\t"+ m[1][1]+"\t"+ m[1][2] +"\n"+"\n"+
				m[2][0] +"\t"+ m[2][1]+"\t"+ m[2][2]);
				n++;
				continue;
			}
			
			if(pos == 8 && (m[0][1].equals("8"))) {
				m[0][1]=s;
			//exibindo as posições para o usuario
				System.out.println("\n" +
				m[0][0] +"\t"+ m[0][1]+"\t"+ m[0][2] +"\n"+"\n"+
				m[1][0] +"\t"+ m[1][1]+"\t"+ m[1][2] +"\n"+"\n"+
				m[2][0] +"\t"+ m[2][1]+"\t"+ m[2][2]);
				n++;
				continue;
			}
			
			if(pos == 9 && (m[0][2].equals("9"))) {
				m[0][2]=s;
			//exibindo as posições para o usuario
				System.out.println("\n" +
				m[0][0] +"\t"+ m[0][1]+"\t"+ m[0][2] +"\n"+"\n"+
				m[1][0] +"\t"+ m[1][1]+"\t"+ m[1][2] +"\n"+"\n"+
				m[2][0] +"\t"+ m[2][1]+"\t"+ m[2][2]);
				n++;
				continue;
			}
			
			else {
			  System.out.println("A posição " + pos + "ja está preenchida" );
			  System.out.println("Digite outra posição e aperte enter: ");
			  continue;
			
			}			
		}
	}
		

}
