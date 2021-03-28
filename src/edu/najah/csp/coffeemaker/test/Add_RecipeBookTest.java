package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.RecipeBook;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class Add_RecipeBookTest {

	@Test
	public void testAddRecipe1() throws RecipeException {
		RecipeBook recipeBook=new RecipeBook();
	    Recipe recipe1 = new Recipe();
	    Recipe recipe2 = new Recipe();
		
	recipe1.setName("Mary");
		recipe1.setAmtChocolate("2");
	recipe1.setAmtCoffee("4");
	recipe1.setAmtMilk("6");
		recipe1.setAmtSugar("8");
		recipe1.setPrice("100");
		
		
		recipe2.setName("zaina");
	    recipe2.setAmtChocolate("2");
		recipe2.setAmtCoffee("3");
		recipe2.setAmtMilk("6");
		recipe2.setAmtSugar("5");
		recipe2.setPrice("70");
		assertTrue(recipeBook.addRecipe(recipe1));
		assertEquals("Mary", recipeBook.getRecipes()[0].getName());
		assertEquals(2,recipeBook.getRecipes()[0].getAmtChocolate());
		assertEquals(4,recipeBook.getRecipes()[0].getAmtCoffee());
		assertEquals(6,recipeBook.getRecipes()[0].getAmtMilk());
		assertEquals(8,recipeBook.getRecipes()[0].getAmtSugar());
		assertEquals(100,recipeBook.getRecipes()[0].getPrice());
		

	}

	@Test(expected=NullPointerException.class)
	public void testAddRecipe2() throws RecipeException
	{
		RecipeBook recipeBook=new RecipeBook();

		Recipe recipe = null;

		assertFalse(recipeBook.addRecipe(recipe));
		recipe = new Recipe();
		assertFalse(recipeBook.addRecipe(recipe));
	}
	
	@Test
	public void testAddRecipe3() throws RecipeException 
	{
		RecipeBook recipeBook = new RecipeBook();
		Recipe recipe1 = new Recipe();
     	recipe1.setName("Mary");
		recipe1.setAmtChocolate("2");
		recipe1.setAmtCoffee("4");
	    recipe1.setAmtMilk("6");
		recipe1.setAmtSugar("8");
		recipe1.setPrice("100");
		
		recipeBook.addRecipe(recipe1);

		assertFalse(recipeBook.addRecipe(recipe1));
	}
	
	@Test(expected=AssertionError.class)
	public void testAddRecipe4() throws RecipeException
	{
		RecipeBook recipeBook = new RecipeBook();
		Recipe recipe1 = new Recipe();
		Recipe recipe1_2 = new Recipe();
     	recipe1.setName("Mary");
		recipe1.setAmtChocolate("2");
		recipe1.setAmtCoffee("4");
	    recipe1.setAmtMilk("6");
		recipe1.setAmtSugar("8");
		recipe1.setPrice("100");
		
		
		recipe1_2.setName("Maremar");
		recipe1_2.setAmtChocolate("2");
		recipe1_2.setAmtCoffee("4");
		recipe1_2.setAmtMilk("6");
		recipe1_2.setAmtSugar("8");
		recipe1_2.setPrice("100");
		recipeBook.addRecipe(recipe1);
		
		assertFalse(recipeBook.addRecipe(recipe1_2));
		

	}
}
