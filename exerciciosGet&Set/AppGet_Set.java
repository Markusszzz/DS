import java.util.Scanner;
public class AppGet_Set {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
			
		String nomezinho;
		int idProdutinho;
		String descProdutinho;
		double valorProdutinho;
		String dataCriacaozinha;
		 
		Produto pdt = new Produto();
		
		System.out.println("Digite o nome do Produto:");
		nomezinho = ler.next();
		pdt.setNomeProduto(nomezinho);
		

		
		System.out.println("Digite o id do Produto");
		idProdutinho = ler.nextInt();
		pdt.setIdProduto(idProdutinho);
		
		System.out.println("Digite a descri��o do Produto");
		descProdutinho = ler.next();
		pdt.setDescProduto(descProdutinho);
		
		System.out.println("Digite o valor do Produto");
		valorProdutinho = ler.nextDouble();
		pdt.setValorProduto(valorProdutinho);
		
		System.out.println("Digite a data de Cria��o: ");
		dataCriacaozinha = ler.next();
		pdt.setDataCriacao(dataCriacaozinha);
		
	
		
		
		System.out.println("O nome do produto: "+pdt.getNomeProduto());
		System.out.println("O id do Produt � de: "+pdt.getIdProduto());
		System.out.println("O id do Produt � de: "+pdt.getDescProduto());
		System.out.println("O id do Produt � de: "+pdt.getValorProduto());
		System.out.println("O id do Produt � de: "+pdt.getDataCriacao());
	
		
	}

}
