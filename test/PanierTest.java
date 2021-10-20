/**
 * 
 */
package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import src.Orange;
import src.Panier;

/**
 * @author orsys
 *
 */
public class PanierTest {
	

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
	}

	/**
	 * Test method for {@link Panier#estPlein()}.
	 */
	@Test
	public void testEstPlein() {
		Panier p = new Panier(5);
		p.ajouteOrange(5, "France");
		p.ajouteOrange(6, "AF");
		p.ajouteOrange(2, "AF");
		p.ajouteOrange(6, "France");
		p.ajouteOrange(2, "Miami");
		assertTrue(p.estPlein());
	}

	/**
	 * Test method for {@link Panier#estVide()}.
	 */
	@Test
	public void testEstVide() {
		Panier p = new Panier(5);
		assertTrue(p.estVide());
	}

	/**
	 * Test method for {@link Panier#ajouteOrange(double, java.lang.String)}.
	 */
	@Test
	public void testAjouteOrange() {
		Panier p = new Panier(5);
		p.ajouteOrange(2, "FR");
assertTrue(p.getOranges().size()==1);
assertTrue(p.getOranges().get(0).getOrigine().equals("FR"));
}

	/**
	 * Test method for {@link Panier#retire()}.
	 */
	@Test
	public void testRetire() {
		Panier p = new Panier(5);
		p.ajouteOrange(2, "FR");
		p.ajouteOrange(2, "FR");
		assertTrue(p.getPrix()==4);
		assertTrue(p.getOranges().size()==2);
		p.retire();
		assertTrue(p.getOranges().size()==1);
		
	}

	/**
	 * Test method for {@link Panier#boycotteOrigine(java.lang.String)}.
	 */
	@Test
	public void testBoycotteOrigine() {
		Panier p = new Panier(5);
		p.ajouteOrange(2, "FR");
		p.ajouteOrange(2, "FR");
		p.ajouteOrange(2, "AUS");
		p.boycotteOrigine("FR");
		assertTrue(p.getOranges().size()==1);
		for (Orange o:p.getOranges()) {
			if (o.getOrigine().equals("FR")) {
				fail();
			}
		}
	}

}
