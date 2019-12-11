package Exercice3;

public class Valeur {
	private int valeur;
	
	public Valeur(int valeur) {
	this.valeur=valeur;
	}
	
	public int getVal() {
		return valeur;
	}
	public void add(int i) {
		this.valeur+=i;
	}
	
	public String toString() {
		return " "+valeur;
	}
	
	

}
