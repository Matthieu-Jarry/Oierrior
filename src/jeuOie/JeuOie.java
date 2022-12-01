package jeuOie;

public class JeuOie {
	
	private Oie[] oies;
    private int nbOie = 0; 
    private Plateau plateau = new Plateau();
    private De de = new De();

    public JeuOie(int nbOieMax) {   
        oies = new Oie[nbOieMax];
    }

    public void ajouterOie(String couleur) { 
        if (nbOie < oies.length) {
            oies[nbOie] = new Oie(couleur, plateau, de);
            nbOie++;
        } else {
            System.out.println("Nombre max d'oie atteind");
        }

    }

    public void jouer() {
    	boolean finPartie = false;
    	int indexOieCourant = 0;
        while (!finPartie) {
        	finPartie = oies[indexOieCourant].action();
        	indexOieCourant++;
        	if (indexOieCourant == nbOie) {
        		indexOieCourant = 0;
        	}
        }
    }

}
