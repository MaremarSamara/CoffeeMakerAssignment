package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class booleanEqual_RecipeTest {

	@Test
	public void testEqualsObject() {
	        Recipe R1 = new Recipe();
	        Recipe R2 = new Recipe();
	        assertTrue(R1.equals(R2)); 

	       
	}
	
	@Test
	public void testEqualsObject2() {
		  Recipe R1 = new Recipe();
		  Recipe R2 = new Recipe();
          System.out.println(R2.getClass());
          System.out.print(R1.getClass());

           assertEquals(R1.getClass(),R2.getClass());
		       
	}
	
	@Test
	public void testEqualsObject3() {
		Recipe one = new Recipe();
	  Recipe two = new Recipe();

		 two.setName(null);
         one.setName("R1");
         System.out.print(two.getName());
         System.out.print(one.getName());

         assertFalse(one.equals(two));
		       
	}
}
