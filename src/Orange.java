package src;

public class Orange {
	
private double prix;
private String origine;
public Orange(double prix, String origine) {
	super();
	this.prix = prix;
	if (prix<0) {
		throw new IllegalArgumentException("Prix negatif");
	}
	this.origine = origine;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public String getOrigine() {
	return origine;
}
public void setOrigine(String origine) {
	this.origine = origine;
}


public void affiche() {
System.out.println ("\nPrix: " + getPrix() + " Origine: "+ getOrigine());
}

}
