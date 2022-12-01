package cases;

import jeuOie.Oie;
import jeuOie.Plateau;

public class Case {
	
	private int numCase;
	
	public Case(int numcase) {
		this.numCase = numcase;
	}
	
	public String getNom() {
		return "numero " + numCase;
	}
	
	public int getNum() {
		return numCase;
	}
	
	public Case depart(Oie oie) {
		String couleurOie = oie.getCouleur();
		String nomCase = this.getNom();
		int valeurDes;
		Case casePlateau;
		oie.ajouterMessage("L'oie " + couleurOie + " est sur la case " + nomCase);
		valeurDes = oie.lancerDe();
		casePlateau = this.suivante(oie, valeurDes + numCase -1);
		return casePlateau;
	}
	
	public Case arrivee(Oie oie) {
		String nomCase = this.getNom();
		oie.ajouterMessage(" ,elle va sur la case " + nomCase);
		return this;
	}
	
	protected Case suivante(Oie oie, int numCaseDestination) {
		Plateau plateau = oie.getPlateau();
		Case caseDestination = plateau.donnerCase(numCaseDestination);
		Case caseArrivee = caseDestination.arrivee(oie);
		return caseArrivee;
	}

}
