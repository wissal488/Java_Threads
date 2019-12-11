package Threads_Java;

public class Compte extends Thread {
	int valeur;
	Compte(int val){
		valeur=val;
	}
	public void run() {
		try {
			for(;;) {
				System.out.println(valeur+"");
				sleep(100);
			}
		}catch(InterruptedException e) {
			return;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Compte(1).start();
		new Compte(20000).start();
	}

}
