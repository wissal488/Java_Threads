package EX4;

public class Voiture implements Runnable{

	String nom; 
	Parking park;
	
	public Voiture(String name, Parking park){
		this.nom=name; 
		this.park=park; 
	}
	public String toString(){ 
		return this.nom;
	} 
	
	public void rentrer() throws InterruptedException{	
		while (!(this.park.accept(this)))
		{
            Thread.sleep((long)  (1000* Math.random()));
    		System.out.format("[%s]  : Je redemande à  rentrer  \n", this.nom);
		}
	}
	
	public void run(){ 
	System.out.format("[%s]: Je débute !  \n", this.nom);
	try {
		
	while(true){
		Thread.sleep((long)  (50000* Math.random()));
		System.out.format(this.nom+": Je demande à  rentrer  \n");
		this.rentrer();
		System.out.format(this.nom+": Je viens d'entrer \n");
		Thread.sleep((long)  (50000* Math.random()));
	    System.out.format(this.nom+": Je demande à  sortir  \n");
	    this.park.leave(this);  

	}}
	catch (InterruptedException e) {
		e.printStackTrace();	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int TailleParking=8;
		int nbVoitures=15; 
		Parking leParking = new Parking(TailleParking);
		
		
		
		Thread MesVoitures[] = new Thread[nbVoitures];

		for (int i =0; i< nbVoitures; i++){
			MesVoitures[i]= new Thread(new Voiture(String.format("Voit "+i) , leParking));
			MesVoitures[i].start();
		}
		
	}

}
