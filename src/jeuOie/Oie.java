package jeuOie;

import cases.Case;
import utils.Journal;

public class Oie {
	
	private String couleur;
	private Plateau plateau;
	private Case casePlateau;
	private Journal journal;
	private De de;
	
	public Oie (String couleur, Plateau plateau, De de) {
		this.couleur = couleur;
		this.plateau = plateau;
		this.de = de;
		this.journal = new Journal();
		this.casePlateau = plateau.caseDebutPartie();
		
	}
	
	public String getCouleur() {
		return couleur;
	}
	
	public Plateau getPlateau() {
		return plateau;
	}
	
	public boolean action() {
		casePlateau = casePlateau.depart(this);
		journal.afficherMessage();
		return casePlateau.getNom().equals("numero 63");
	}
	
	public int lancerDe() {
		int valeurDes = de.lancer();
		journal.ajouterMessage(" ,elle fait " + valeurDes);
		return valeurDes;
	}
	
	public void ajouterMessage(String message) {
		journal.ajouterMessage(message);
	}

}
