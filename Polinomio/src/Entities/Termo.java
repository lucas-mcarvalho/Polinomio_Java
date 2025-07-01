package Entities;

public class Termo {
	
	private double coeficiente;
	private int expoente;
	
	
	public Termo(double coeficiente, int expoente) {
		this.coeficiente = coeficiente;
		this.expoente = expoente;
	}

	public Termo() {
		this.coeficiente = coeficiente;
		this.expoente = expoente;
	}
	
	public void insere(Termo termo) {
		this.coeficiente = termo.coeficiente;
		this.expoente = termo.expoente;
	}
	
	public double calcula(double x) {
		return getCoeficiente()*Math.pow(x, getExpoente());
	}

	public double getCoeficiente() {
		return coeficiente;
	}

	public void setCoeficiente(double coeficiente) {
		this.coeficiente = coeficiente;
	}

	public int getExpoente() {
		return expoente;
	}

	public void setExpoente(int expoente) {
		this.expoente = expoente;
	}
	
	
	

}
