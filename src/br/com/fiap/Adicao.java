package br.com.fiap;


public class Adicao {
	private int numInteiro1;
	private int numInteiro2;
	private double numReal1;
	private double numReal2;
	
	public Adicao() {
		
	}

	public int getNumInteiro1() {
		return numInteiro1;
	}

	public void setNumInteiro1(int numInteiro1) {
		this.numInteiro1 = numInteiro1;
	}

	public int getNumInteiro2() {
		return numInteiro2;
	}

	public void setNumInteiro2(int numInteiro2) {
		this.numInteiro2 = numInteiro2;
	}

	public double getNumReal1() {
		return numReal1;
	}

	public void setNumReal1(double numReal1) {
		this.numReal1 = numReal1;
	}

	public double getNumReal2() {
		return numReal2;
	}

	public void setNumReal2(double numReal2) {
		this.numReal2 = numReal2;
	}
	
	public int somaNumeros(int numInteiro1, int numInteiro2) {
		setNumInteiro1(numInteiro1);
		setNumInteiro2(numInteiro2);
		int Resultado = numInteiro1 + numInteiro2;
		return Resultado;
	}
	public double somaNumeros(double numReal1, double numReal2) {
		setNumReal1(numReal1);
		setNumReal2(numReal2);
		double Resultado1 = numReal1  + numReal2;
		return Resultado1;
	}
}
