import java.util.*;
public class Produto {
	private String nomeProduto;
	private int idProduto;
	private String descProduto;
	private double valorProduto;
	private String dataCriacao;
	
	Scanner in = new Scanner(System.in);
	
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
	
	
	
}
