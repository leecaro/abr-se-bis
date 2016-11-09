package abr_package;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ABRTest {

	@Test
	public void testInsert() {
		
		ABR arbre = new ABR();
		int value = 1;
		arbre.insert(value);
		
		assertTrue(arbre.contains(value));
	}
	
	@Test
	public void testIsEmpty() {
		
		ABR arbre = new ABR();
		assertEquals(0, arbre.nbElements());
	}
	
	@Test
	public void testNbElements() {
		
		ABR arbre = new ABR();
		int value = 1;
		arbre.insert(value);
		
		assertTrue(arbre.nbElements() == 1);
	}

}
