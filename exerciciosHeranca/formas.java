import java.util.Scanner;

public abstract class formas {
	private double  base;
	private double altura;
	private double baseM;
	private double baseG;
	private double lados;
	
	formas(double base, double altura, double baseM, double baseG, double lados){
		
		this.base = base;
		this.altura = altura;
		this.baseG = baseM;
		this.baseM = baseG;
		this.lados = lados;
		
		
	}

	public double getLados() {
		return lados;
	}

	public void setLados(double lados) {
		this.lados = lados;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBaseM() {
		return baseM;
	}

	public void setBaseM(double baseM) {
		this.baseM = baseM;
	}

	public double getBaseG() {
		return baseG;
	}

	public void setBaseG(double baseG) {
		this.baseG = baseG;
	}
	
	abstract void calcularArea(double base, double altura, double baseM, double baseG, double lados);
	
}