package EX3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Valeur myVal=new Valeur();
		
		Ajob job1=new Ajob(myVal, 1);
		Ajob job2=new  Ajob(myVal, -1);
		
		new Thread(job1).start();
		new Thread(job2).start();
		
	}

}
