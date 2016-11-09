package abr_package;

public class Noeud {
	
	Noeud right;
	Noeud left;
	int valeur;
	
	Noeud(int value, Noeud droit, Noeud gauche) { //noeud avec descendance
		
		this.valeur = value;
		this.right = droit;
		this.left = gauche;
		
	}
	
	Noeud(int value) { //noeud sans descendance
		
		this.valeur = value;
		this.right = null;
		this.left = null;
		
	}
	
	public int getValue() {
		return this.valeur;
	}

}
