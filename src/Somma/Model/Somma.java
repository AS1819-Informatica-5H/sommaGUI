package Somma.Model;

public class Somma {
	private int numero1;
	private int numero2;

	public Somma() {
		this.numero1 = 0;
		this.numero2 = 0;
	}
	
	
	public int getNumero1() {
		return numero1;
	}



	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}



	public int getNumero2() {
		return numero2;
	}



	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}



	public Somma(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	public int GetSomma() {
		return this.numero1+this.numero2;
	}
}
