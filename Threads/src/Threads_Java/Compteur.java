package Threads_Java;

public class Compteur extends Thread {
	String nom;
	int maxValue;

	public Compteur(String nom,int maxValue) {
		this.nom=nom;
		this.maxValue=maxValue;
	}
	public Compteur(String nom) {
		this(nom,10);
	}
	
	public void run() {
		try {
			for(int i=1;i<maxValue;i++) {
				System.out.println("Le nom de Thread est: "+nom+" la valeur de compteur est: "+i);
				sleep(100);
			}
			
		}catch(InterruptedException e) {
			return;
		}
	}
}
