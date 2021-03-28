package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Inventory;
import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class AmtChocalet_RecipeTest {

	//@Test
	//public void testGetAmtChocolate() {
		
//	}

	@Test(expected=RecipeException.class)
	public void testSetAmtChocolate1() throws RecipeException {
		double expected =-4;
		double actual=0;
		String amtCh="-4";
		Recipe objRecipe=new Recipe();

			objRecipe.setAmtChocolate(amtCh);
		
		 actual=objRecipe.getAmtChocolate();
		 assertTrue(expected==actual);
	}
	
	@Test
	public void testSetAmtChocolate2() throws RecipeException {
		double expected =0;
		double actual=0;
		String amtCh="0";
		Recipe objRecipe=new Recipe();
		
			objRecipe.setAmtChocolate(amtCh);
		
		 actual=objRecipe.getAmtChocolate();
		 assertTrue(expected==actual);
	}
	
	@Test
	public void testSetAmtChocolate3() throws RecipeException {
		double expected =8;
		double actual=-1;
		String amtCh="8";
		Recipe objRecipe=new Recipe();
		
			objRecipe.setAmtChocolate(amtCh);
		
		 actual=objRecipe.getAmtChocolate();
		 assertTrue(expected==actual);
	}
	
	@Test(expected=NumberFormatException.class)
	public void testSetAmtChocolate4() throws RecipeException {
		double expected =9;
		double actual=-1;
		String amtCh="9.5";
		Recipe objRecipe=new Recipe();
	
			objRecipe.setAmtChocolate(amtCh);
		
		 actual=objRecipe.getAmtChocolate();
		 assertTrue(expected==actual);
	}
	@Test(expected=NumberFormatException.class)
	public void testSetAmtChocolate5() throws RecipeException ,NumberFormatException{
		double expected =-4;
		double actual=-1;
		String amtCh="x";
		Recipe objRecipe=new Recipe();
		
			objRecipe.setAmtChocolate(amtCh);
		
		 actual=objRecipe.getAmtChocolate();
		 assertTrue(expected==actual);
	}
	
	}


