package Threads_Java;

public class TestOrder {

	public static void main(String[] args) {

		Compteur[] comp= {
			new Compteur("Wissal"),
			new Compteur("Ayoub"),
			new Compteur("Alae"),
			new Compteur("Yassine")
		};
		for(int i=0;i<comp.length;i++) {
			comp[i].start();
		}
	}

}
