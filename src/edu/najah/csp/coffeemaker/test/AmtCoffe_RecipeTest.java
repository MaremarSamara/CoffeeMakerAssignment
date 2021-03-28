package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class AmtCoffe_RecipeTest {

	//@Test
	//public void testGetAmtCoffee() {
		
	//}

	@Test(expected=RecipeException.class)
    public void testSetAmtCoffee1() throws RecipeException {
		double expected =-4;
		double actual=0;
			String amtCh="-4";
			Recipe objCoffe=new Recipe();

			objCoffe.setAmtCoffee(amtCh);
			
			 actual=objCoffe.getAmtCoffee();
			 assertTrue(expected==actual);
		}
		
		@Test
		public void testSetAmtCoffee2() throws RecipeException {
			double expected =0;
			double actual=0;
			String amtCh="0";
			Recipe objCoffe=new Recipe();
			
			objCoffe.setAmtCoffee(amtCh);
			
			 actual=objCoffe.getAmtCoffee();
			 assertTrue(expected==actual);
		}
		
		@Test
		public void testSetAmtCoffee3() throws RecipeException {
			double expected =8;
			double actual=-1;
			String amtCh="8";
			Recipe objCoffe=new Recipe();
			
			objCoffe.setAmtCoffee(amtCh);
			
			 actual=objCoffe.getAmtCoffee();
			 assertTrue(expected==actual);
		}
		
		@Test(expected=NumberFormatException.class)
		public void testSetAmtCoffee4() throws RecipeException {
			double expected =9;
			double actual=-1;
			String amtCh="9.5";
			Recipe objCoffe=new Recipe();
		
			objCoffe.setAmtCoffee(amtCh);
			
			 actual=objCoffe.getAmtCoffee();
			 assertTrue(expected==actual);
		}
		@Test(expected=NumberFormatException.class)
		public void testSetAmtCoffee5() throws RecipeException ,NumberFormatException{
			double expected =-4;
			double actual=-1;
			String amtCh="x";
			Recipe objCoffe=new Recipe();
			
			objCoffe.setAmtCoffee(amtCh);
			
			 actual=objCoffe.getAmtCoffee();
			 assertTrue(expected==actual);
		}
		
	}


