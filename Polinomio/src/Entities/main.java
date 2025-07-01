package Entities;

public class main {

	public static void main(String[] args) {
		
		Termo t1 = new Termo(1,2);
		Termo t2 = new Termo(1,2);
		
		Polinomio p = new Polinomio(t1);
		p.insere(t2);
		
		System.out.println(p);

	}

}
