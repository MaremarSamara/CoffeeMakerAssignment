package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.RecipeBook;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class Delete_RecipeBookTest {

	@Test(expected=AssertionError.class)
	public void testDeleteRecipe1() throws RecipeException {
		RecipeBook recipeBook=new RecipeBook();
		Recipe recipe1 = new Recipe();
	  
		
	    recipe1.setName("Mary");
		recipe1.setAmtChocolate("2");
	    recipe1.setAmtCoffee("4");
	    recipe1.setAmtMilk("6");
		recipe1.setAmtSugar("8");
		recipe1.setPrice("100");
		
		recipeBook.addRecipe(recipe1);
		recipeBook.deleteRecipe(0);
		System.out.print(recipeBook.getRecipes()[0].getName());
		assertTrue(recipeBook.getRecipes()[0].getName().equals(null));
		
	}
	@Test
	public void testDeleteRecipe2() throws RecipeException
	{
		RecipeBook recipeBook=new RecipeBook();
		Recipe recipe1 = new Recipe();
		recipe1.setName("Mary");
		recipe1.setAmtChocolate("2");
	    recipe1.setAmtCoffee("4");
	    recipe1.setAmtMilk("6");
		recipe1.setAmtSugar("8");
		recipe1.setPrice("100");
		
		recipeBook.addRecipe(recipe1);
		String deleted = recipeBook.deleteRecipe(0);
		assertEquals("Mary",deleted);
	}
	
	@Test
	public void testDeleteRecipe3() throws RecipeException
	{
		RecipeBook recipeBook=new RecipeBook();
		Recipe recipe1 = new Recipe();
		recipe1.setName("Mary");
		recipe1.setAmtChocolate("2");
	    recipe1.setAmtCoffee("4");
	    recipe1.setAmtMilk("6");
		recipe1.setAmtSugar("8");
		recipe1.setPrice("100");
		recipeBook.addRecipe(recipe1);
		assertEquals(null, recipeBook.deleteRecipe(1));
	}
}
