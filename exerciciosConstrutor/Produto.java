

import java.util.*;
public class Produto {

 
	private String nomeProduto;
	private int idProduto;
	private String descProduto;
	private double valorProduto;
	private String dataCriacao;
	
 Produto(String nomeProduto, int idProduto, String descProduto, double valorProduto, String dataCriacao) {
	 Scanner ler = new Scanner(System.in);
	 System.out.println("Digite o nome do Produto: ");
	 nomeProduto = ler.next();
	 
	 System.out.println("Digite o id do Produto: ");
	 idProduto = ler.nextInt();
	 
	 System.out.println("Digite a Descrição do Produto");
	 descProduto = ler.next();
	 
	 System.out.println("Digite o valor do Produto: ");
	 valorProduto = ler.nextDouble();
	 
	 System.out.println("Digite a data de criação do Produto: ");
	 dataCriacao = ler.next();
	 
	 
	 
	 this.nomeProduto = nomeProduto ;
	 this.idProduto = idProduto ;
	 this.descProduto = descProduto ;
	 this.valorProduto = valorProduto ;
	 this.dataCriacao = dataCriacao ;
	 
}

	
	
	
	





	public String getNomeProduto() {
		return nomeProduto;
		
	}
	public void setNomeProduto (String NomeProduto) {
		
		this.nomeProduto = NomeProduto;
		
	}
	
	public int getIdProduto() {
		return idProduto;
		
	}
	public void setIdProduto (int IdProduto) {
		
		this.idProduto = IdProduto;
		
	}
	
	public String getDescProduto() {
		return descProduto;
		
	}
	public void setDescProduto (String DescProduto) {
		
		this.descProduto = DescProduto;
		
	}
	
	public double getValorProduto() {
		return valorProduto;
		
	}
	public void setValorProduto (double valorProdutinho) {
		
		this.valorProduto = valorProdutinho;
		
	}
	
	
	public String getDataCriacao() {
		return dataCriacao;
		
	}
	public void setDataCriacao (String DataCriacao) {
		
		this.dataCriacao = DataCriacao;
		
	}
	
	
	
	public void apresentarProduto(String nomeProduto, int idProduto, String descProduto, double valorProduto, String dataCriacao) {
		this.nomeProduto = nomeProduto ;
		 this.idProduto = idProduto ;
		 this.descProduto = descProduto ;
		 this.valorProduto = valorProduto ;
		 this.dataCriacao = dataCriacao ;
		 
		 System.out.println("O nome do produto eh:"+nomeProduto);
		 System.out.println("O id do produto eh:"+nomeProduto);
		 System.out.println("A descricao do produto eh:"+nomeProduto);
		 System.out.println("O valor do produto eh:"+nomeProduto);
		 System.out.println("a data de criacao do produto eh:"+nomeProduto);
		 
		 
	}











	
	
}