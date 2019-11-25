package EX3;

public class Ajob implements Runnable{
	Valeur myVal;
	int i;
	public Ajob(Valeur myVal, int i) {
		this.myVal=myVal;
		this.i=i;
	}
	public void run() {
		double fois= Math.pow(10, 2);
		try {
		for(int j=0;j<fois;j++) {
			myVal.add(i);
			System.out.println(myVal+" ");
			Thread.sleep(100);
			
		}
		}catch (InterruptedException e) {
			return;
		}
	}

}
