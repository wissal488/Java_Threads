package Exercice2;

public class Compteur extends Thread {
	private String nom;
	private int maxValue;
	private final static int delay=100;
	 
	public Compteur(String nom,int maxValue) {
		this.nom=nom;
		this.maxValue=maxValue;
	}
	public Compteur(String nom) {
		this(nom,10);
	}

	public void run() {
	    for (int i = 1; i <= maxValue; i++) {
	      try {
	        sleep((int)(Math.random() * delay));
	      } 
	      catch(InterruptedException e) {
	        return;
	      }
	      System.out.println(nom + " : " + i);
	    }
	    System.out.println( nom + " a fini de compter jusqu'à " + maxValue);
	  }
	//3- Oui, l'affichage de sortie est déterministe.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compteur[] compteurs= {
				new Compteur("C1"),
				new Compteur("C2"),
				new Compteur("C3")};
		for(int i=0;i<compteurs.length;i++) {
			compteurs[i].start();
				
		}
	}

}
