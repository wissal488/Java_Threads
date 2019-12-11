package Exercice3;

public class Ajob implements Runnable{

	private Valeur myVal;
	private int i;
	
	public Ajob(Valeur v,int i) {
		myVal=v;
		this.i=i;
	}
	
	
	@Override
	public void run() {

		for(int j=1;j<Math.pow(10, 6);j++) {
			myVal.add(i);
			System.out.println("MyValeur = "+myVal);
		}
		
		System.out.println("MyValeur = "+myVal);
	}
	
	
	
	
}
