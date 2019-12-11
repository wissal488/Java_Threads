package Threads_Java;

public class EX1_Thread extends Thread {
	int valeur;
	EX1_Thread(int val){
		valeur=val;
	}
	public void run() {
		if(valeur==1) {
			for(int i=1;i<=1000;i++) {
				System.out.println("TA = "+i+" ");
			}
		}
		if(valeur==1000) {
			for(int j=1000;j>=1;j--) {
				System.out.println("TB = "+j+" ");
			}
		}
		if(valeur!=1 && valeur!=1000){
			System.out.println("Le nombre sasit n'est pas correct.\nSaisit soit 1 ou 1000!!!!");
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new EX1_Thread(1).start();
		new EX1_Thread(1000).start();
	}

}
