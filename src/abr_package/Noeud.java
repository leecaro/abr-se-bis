package abr_package;

public class Noeud {
	
	Noeud right;
	Noeud left;
	int valeur;
	int pos;
	
	Noeud(int value, int position, Noeud droit, Noeud gauche) { //noeud avec descendance
		
		this.valeur = value;
		this.pos = position;
		this.right = droit;
		this.left = gauche;
		
	}
	
	Noeud(int value, int position) { //noeud sans descendance
		
		this.valeur = value;
		this.pos = position;
		this.right = null;
		this.left = null;
		
	}
	
	public int getValue() {
		return this.valeur;
	}

}
