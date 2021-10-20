package src;


public class Main {

	public static void main(String[] args) {
		Panier p = new Panier(5);
		p.ajouteOrange(5, "France");
		p.ajouteOrange(6, "AF");
		p.ajouteOrange(2, "AF");
		p.ajouteOrange(6, "France");
		p.ajouteOrange(2, "Miami");
		p.ajouteOrange(2, "SF");
		p.ajouteOrange(2, "SK");
		p.affiche();
		System.out.println("\nreture");
		p.retire();
		p.affiche();
		p.boycotteOrigine("France");
		System.out.println("\nboycot");
		p.affiche();
	}

}
