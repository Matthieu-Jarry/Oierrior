package jeuOie;

import java.util.Random;

public class De {
	
	private Random rand = new Random();
	
	public int lancer() {
		int valeurDes = rand.nextInt(1,7);
		valeurDes += rand.nextInt(1,7);
		return valeurDes;
	}
}
