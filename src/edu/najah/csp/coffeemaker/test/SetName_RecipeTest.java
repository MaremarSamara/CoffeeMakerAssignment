package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class SetName_RecipeTest {

//	@Test
//	public void testGetName() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testSetName() throws RecipeException{
		String expected ="";
		String actual="";
		String amtName=null;
		Recipe objectRecipe=new Recipe();

		objectRecipe.setName(amtName);
		
		 actual=objectRecipe.getName();
		 System.out.print(objectRecipe.getName());
		 assertTrue(expected==actual);
	}
	 

	@Test
	public void testSetName2() throws RecipeException{
		String expected ="Maremar";
		String actual="";
		String amtName="Maremar";
		Recipe objectRecipe=new Recipe();

		objectRecipe.setName(amtName);
	
		 actual=objectRecipe.getName();
		 assertTrue(expected==actual);
	}
	@Test
	public void testSetName3() throws RecipeException,NumberFormatException{
		String expected ="1";
		String actual="";
		String amtName="1";
		Recipe objectRecipe=new Recipe();

		objectRecipe.setName(amtName);
		
		 actual=objectRecipe.getName();
		 
		 assertTrue(expected==actual);
	}
}
