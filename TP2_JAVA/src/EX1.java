
public class EX1 implements Runnable{

	int valeur;
	String nom;
	public EX1(String nom,int val) {
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
	Runnable EX1=new EX1("TA",1);
	Runnable EX2=new EX1("TB",1000);
	new Thread(EX1).start();
	new Thread(EX2).start();


}
}
