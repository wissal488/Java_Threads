package Exercice3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Valeur Myval = new Valeur(1);
		Runnable job1 = new Ajob(Myval, 1);
		Runnable job2 = new Ajob(Myval, -1);
		
		new Thread(job2).start();
		new Thread(job1).start();
		
		System.out.println("la valeur stocké = "+Myval);

		

	}}
