package abr_package;

import java.util.ArrayList;
import java.util.List;

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
			Noeud n = new Noeud(value, 1);
			arbre.add(n);
		} else {
			if (b && equals((arbre.isEmpty()))) { //si elle n'est pas dans l'arbre, on l'ajoute
				Noeud n = new Noeud(value, arbre.size() + 1);
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
	
	public int maxPosition() {
		
		int max = 1;
		for (Noeud n : arbre) {
			if (n.pos > max) {
				max = n.pos;
			}
		}
		return max;
	}
	
	/**public void toList(java.util.List<java.lang.Integer> l) {
		
		int max = 1;
		for (Noeud n : arbre) {
			if (n.pos > max) {
				max = n.pos;
			}
		}
		
		for (int i = 0; i < max; i ++) {
			for (Noeud m : arbre) {
				if (m.pos == i) {
					l.add(m); //add() ne fonctionne pas pour ajouter un noeud à la liste l
				}
			}
		}
	}**/
}
