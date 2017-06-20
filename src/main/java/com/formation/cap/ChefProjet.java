package com.formation.cap;

public class ChefProjet implements Post {

	private int nbrAnnee;

	public int getNbrAnnee() {
		return nbrAnnee;
	}

	public void setNbrAnnee(int nbrAnnee) {
		this.nbrAnnee = nbrAnnee;
	}

	public void afficher() {
		System.out.println("ChefProjet");
	}

}
