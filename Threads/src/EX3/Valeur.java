package EX3;

public class Valeur {

	int valeur=0;
	public int getVal() {
		return valeur;
	}
	public synchronized void add(int i) {
		valeur+=i;
	}
	public String toString() {
		return"La valeur est"+valeur;
	}
}
