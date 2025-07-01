package Entities;

import java.util.ArrayList;
import java.util.List;

public class Polinomio {
	
	private List<Termo> termos = new ArrayList<>();
	
	public Polinomio(Termo termo) {
		termos.add(termo);
	}
	
	public void insere(Termo termo) {
		boolean unificado = false;
		
		for(Termo t: termos) {
			if(t.getExpoente() == termo.getExpoente()) {
				double novoCoeficiente = t.getCoeficiente()+termo.getCoeficiente();
				t.insere(new Termo(novoCoeficiente,termo.getExpoente()));
				unificado = true;
			}
		}
		if(!unificado) {
			termos.add(new Termo(termo.getCoeficiente(),termo.getExpoente()));
		}
	}
	
	public double calcular(double x) {
		double resultado = 0;
		for(Termo t: termos) {
			resultado = t.calcula(x);
		}
		return resultado;
	}
	
	public void fusao(Polinomio p) {
		for(Termo t: termos) {
			p.insere(t);
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(int i =0 ; i< termos.size();i++) {
			Termo t = termos.get(i);
			sb.append(t.getCoeficiente()).append("X^").append(t.getExpoente());
		}
		return sb.toString();
	}
}
