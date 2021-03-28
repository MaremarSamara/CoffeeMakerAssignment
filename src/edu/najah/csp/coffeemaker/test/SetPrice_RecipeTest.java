package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class SetPrice_RecipeTest {

//	@Test
//	public void testGetPrice() {
//		fail("Not yet implemented");
//	}

	@Test(expected=RecipeException.class)
	public void testSetPrice1() throws RecipeException {
		double expected =-4;
		double actual=0;
		String amtCh="-4";
		Recipe objPrice=new Recipe();

		objPrice.setPrice(amtCh);
		
		 actual=objPrice.getPrice();
		 assertTrue(expected==actual);
	}

	@Test
	public void testSetPrice2() throws RecipeException {
		double expected =0;
		double actual=0;
		String amtCh="0";
		Recipe objPrice=new Recipe();

		objPrice.setPrice(amtCh);
		
		
		 actual=objPrice.getPrice();
		 assertTrue(expected==actual);
	}
	
	@Test
	public void testSetPrice3() throws RecipeException {
		double expected =8;
		double actual=0;
		String amtCh="8";
		Recipe objPrice=new Recipe();

		objPrice.setPrice(amtCh);
		
		 actual=objPrice.getPrice();
		 assertTrue(expected==actual);
	}
	@Test(expected=NumberFormatException.class)
	public void testSetPrice4() throws RecipeException {
		double expected =8;
		double actual=0;
		String amtCh="8.4";
		Recipe objPrice=new Recipe();

		objPrice.setPrice(amtCh);
		
		 actual=objPrice.getPrice();
		 assertTrue(expected==actual);
	}
	@Test(expected=NumberFormatException.class)
	public void testSetPrice5() throws RecipeException {
		double expected =8;
		double actual=0;
		String amtCh="x";
		Recipe objPrice=new Recipe();

		objPrice.setPrice(amtCh);
		
		 actual=objPrice.getPrice();
		 assertTrue(expected==actual);
	}
}
