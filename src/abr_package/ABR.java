package abr_package;

import java.util.ArrayList;

public class ABR {
	
	ArrayList<Noeud> arbre = new ArrayList<Noeud>();
	
	public ABR() { // construit un arbre vide
		
		ArrayList<Noeud> arbre = new ArrayList<Noeud>();
		
	}
	
	public void insert(int value) {
		
		boolean b = false;
		
		if (arbre.contains(value)) {
				b = true;
			}
		
		if (arbre.isEmpty()) { //si l'arbre est vide on l'ajoute
			Noeud n = new Noeud(value);
			arbre.add(n);
		} else {
			if (b && equals((arbre.isEmpty()))) { //si elle n'est pas dans l'arbre, on l'ajoute
				Noeud n = new Noeud(value);
				arbre.get(-1).left = n; //on ajoute le noeud en fin d'arbre de façon pas très réfléchie
				arbre.add(n);
			}
		}
		
	}
	
	public boolean isEmpty() {
		return arbre.isEmpty(); //on utilise la méthode isEmpty() de ArrayList
	}
	
	public int nbElements() {
		return arbre.size();
	}
	
	public boolean contains(int value) {
		
		boolean b = false;
		int i = 0;
		int j = 0;
		
		while (i < arbre.size()) {
			if (value == arbre.get(i).getValue()) {
				j = j + 1;
			} i = i + 1;
		}
		
		if ( j== 1) {
			b = true;
		}
		return b;
	}
	
}
