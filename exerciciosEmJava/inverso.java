package vetores;

import java.util.Scanner;

public class ex03 {

	int numero, i=0, numeroI;
	System.out.println("Digite um n�mero de tres algarismos:");
	Scanner leia = new Scanner(System.in);
	numero = leia.nextInt();
	numeroI = numero;

	while (numero>0) {
		i = i*10;
		i = i + (numero % 10);
		numero = numero/10;
	}
	if(numeroI>999||numeroI<100) {
		System.out.println("Numero invalido, digite apenas numeros com tres algarismos");
	}
	else {
		System.out.println("A ordem inversa desse numero eh: "+i);
	}
	

}

}
