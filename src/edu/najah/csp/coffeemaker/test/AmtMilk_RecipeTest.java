package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class AmtMilk_RecipeTest {

	//@Test
	//public void testGetAmtMilk() {
	//	fail("Not yet implemented");
	//}

	       @Test(expected=RecipeException.class)
            public void testSetAmtMilk1() throws RecipeException {
	    	   double expected =-4;
	    	   double actual=0;
				String amtCh="-4";
				Recipe objMilk=new Recipe();
                objMilk.setAmtMilk(amtCh);
				actual=objMilk.getAmtMilk();
				 assertTrue(expected==actual);
			}
			
			@Test
			public void setAmtMilk2() throws RecipeException {
				double expected =0;
				double actual=0;
				String amtCh="0";
				Recipe objMilk=new Recipe();
				
				objMilk.setAmtCoffee(amtCh);
				
				 actual=objMilk.getAmtMilk();
				 assertTrue(expected==actual);
			}
			
			@Test
			public void setAmtMilk3() throws RecipeException {
				double expected =8;
				double actual=-1;
				String amtCh="8";
				Recipe objMilk=new Recipe();
				
				objMilk.setAmtMilk(amtCh);
				
				 actual=objMilk.getAmtMilk();
				 assertTrue(expected==actual);
			}
			
			@Test(expected=NumberFormatException.class)
			public void setAmtMilk4() throws RecipeException {
				double expected =9;
				double actual=-1;
				String amtCh="9.5";
				Recipe objMilk=new Recipe();
			
				objMilk.setAmtMilk(amtCh);
				
				 actual=objMilk.getAmtMilk();
				 assertTrue(expected==actual);
			}
			
			
			@Test(expected=NumberFormatException.class)
			public void setAmtMilk5() throws RecipeException ,NumberFormatException{
				double expected =-4;
				double actual=-1;
				String amtCh="x";
				Recipe objMilk=new Recipe();
				
				objMilk.setAmtMilk(amtCh);
				
				 actual=objMilk.getAmtMilk();
				 assertTrue(expected==actual);
			}
			

}
