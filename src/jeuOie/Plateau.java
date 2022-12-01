package jeuOie;

import cases.Case;

public class Plateau {

	private final int NB_CASES = 63;
	private Case[] cases;
	
	public Plateau() {
		cases = new Case[NB_CASES];
		for (int i = 0; i<NB_CASES; i++) {
			cases[i] = new Case(i+1);
		}
	}
	
	private void initialisationCasesSpecifique() {

	}
	
	public Case donnerCase(int numCase) {
		if (numCase>= NB_CASES) {
			numCase = 2*(NB_CASES-1) - numCase;
		}
		return cases[numCase];
	}
	
	public Case caseDebutPartie() {
		return cases[0];
	}
}
