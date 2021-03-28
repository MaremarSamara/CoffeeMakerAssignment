package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;

public class ToString_RecipeTest {

	@Test
	public void testToString() {
		Recipe objString=new Recipe();
		
		objString.getName();
		objString.getAmtChocolate();
		objString.getAmtCoffee();
		objString.getAmtMilk();
		objString.getAmtSugar();
		objString.getPrice();
		
		
    
		StringBuffer buf = new StringBuffer();
		buf.append("Name: ");
		buf.append(objString.getName());
    	buf.append("\n");
    	buf.append("Price: ");
    	buf.append(objString.getPrice());
    	buf.append("\n");
    	buf.append("Sugar: ");
    	buf.append(objString.getAmtSugar());
    	buf.append("Chocolate: ");
    	buf.append(objString.getAmtChocolate());
    	buf.append("\n");
    	buf.append("Milk: ");
    	buf.append(objString.getAmtMilk());
    	buf.append("\n");
    	buf.append("Coffee: ");
    	buf.append(objString.getAmtCoffee());
    	buf.append("\n");
    	System.out.print(buf.toString());
        assertNotEquals(buf.toString(),objString.toString());
	}

//	@Test
//	public void testToString2() {
//		Recipe objString=new Recipe();
//		objString.setName("TOString");
//		assertEquals("TOString",objString.toString());
// System.out.print(objString.toString());
//	}
//
//
//	@Test
//	public void testToString3() {
//		Recipe objString=new Recipe();
//		objString.setName(null);
//		assertEquals("",objString.toString());
// System.out.print(objString.toString());
//	}
	

}