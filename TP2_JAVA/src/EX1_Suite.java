
public class EX1_Suite extends Thread{
	int valeur;
	String nom;
	public EX1_Suite(String nom,int val) {
		valeur=val;
		this.nom=nom;
	}
	public void run() {
	// TODO Auto-generated method stub
		
			if(valeur==1) {
				for(int i=0;i<1000;i++) {
				System.out.println(nom +"="+valeur);
				valeur++;}
				}
			else if(valeur==1000) {
				for(int j=1000;j>0;j--) {
				System.out.println(nom +"="+valeur);
				valeur--;}
			}
		
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new EX1_Suite("TA",1).start();
		new EX1_Suite("TB",1000).start();
	}

}
