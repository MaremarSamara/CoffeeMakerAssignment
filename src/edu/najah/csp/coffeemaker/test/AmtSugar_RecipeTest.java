package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class AmtSugar_RecipeTest {

	/*
	 * @Test public void testGetSugar() {
	 * 
	 * }
	 */

	@Test(expected=RecipeException.class)
	public void testSetAmtSugar1() throws RecipeException{
		double expected =-4;
		double actual=0;
		String amtCh="-4";
		Recipe objRecipe=new Recipe();

			objRecipe.setAmtSugar(amtCh);
		
		 actual=objRecipe.getAmtSugar();
		 assertTrue(expected==actual);
	}
	
	@Test
	public void testSetAmtSugar2() throws RecipeException {
		double expected =0;
		double actual=0;
		String amtSuger="0";
		Recipe objRecipe=new Recipe();
		
			objRecipe.setAmtSugar(amtSuger);
		
		 actual=objRecipe.getAmtSugar();
		 assertTrue(expected==actual);
	}
	
	@Test
	public void testSetAmtSugar3() throws RecipeException {
		double expected =8;
		double actual=-1;
		String amtSuger="8";
		Recipe objRecipe=new Recipe();
		
			objRecipe.setAmtSugar(amtSuger);
		
		 actual=objRecipe.getAmtSugar();
		 assertTrue(expected==actual);
	}
	
	@Test(expected=NumberFormatException.class)
	public void testSetAmtSugar4() throws RecipeException {
		double expected =9;
		double actual=-1;
		String amtSuger="9.5";
		Recipe objRecipe=new Recipe();
	
			objRecipe.setAmtSugar(amtSuger);
		
		 actual=objRecipe.getAmtSugar();
		 assertTrue(expected==actual);
	}
	@Test(expected=NumberFormatException.class)
	public void testSetAmtSugar5() throws RecipeException ,NumberFormatException{
		double expected =-4;
		double actual=-1;
		String amtSuger="x";
		Recipe objRecipe=new Recipe();
		
			objRecipe.setAmtSugar(amtSuger);
		
		 actual=objRecipe.getAmtSugar();
		 assertTrue(expected==actual);
	}
	

}
