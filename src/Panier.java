package src;

import java.util.ArrayList;


public class Panier {
private ArrayList <Orange> oranges;
private int max;

public Panier (int nb) {
	max = nb;
	oranges = new ArrayList<Orange>();
}

public boolean estPlein() {
	return oranges.size()==max?true:false;
}

public boolean estVide() {
	return oranges.isEmpty();
}

public void affiche() {
	for (Orange orange: oranges) {
		orange.affiche();
	}
}

public void ajouteOrange (double prix, String origine ) {
	if (!estPlein()) {
		oranges.add(new Orange(prix, origine));
	}
}

public void retire () {
	oranges.remove(oranges.size()-1);
}

public double getPrix () {
	double value=0;
	for (Orange orange:oranges) {
		value = value + orange.getPrix();
	}
	return value;
}

public void boycotteOrigine (String ori) {
	oranges.removeIf(o->(o.getOrigine().equals(ori)));
}

public ArrayList<Orange> getOranges() {
	return oranges;
}
}
