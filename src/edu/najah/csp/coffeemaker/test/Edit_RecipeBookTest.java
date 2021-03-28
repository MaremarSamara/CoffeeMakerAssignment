package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.RecipeBook;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class Edit_RecipeBookTest {

	@Test(expected=AssertionError.class)
	public void testEditRecipeSuccess() throws RecipeException
	{
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
		recipeBook.addRecipe(recipe1);
		assertEquals("Mary",recipeBook.editRecipe(0, recipe2));
		assertEquals("", recipeBook.getRecipes()[0].getName());
		assertEquals(20,recipeBook.getRecipes()[0].getAmtChocolate());
		assertEquals(3,recipeBook.getRecipes()[0].getAmtCoffee());
		assertEquals(1,recipeBook.getRecipes()[0].getAmtMilk());
		assertEquals(1,recipeBook.getRecipes()[0].getAmtSugar());
		assertEquals(75,recipeBook.getRecipes()[0].getPrice());
	}
	
	@Test 
	public void testEditRecipe2 () throws RecipeException
	{
		RecipeBook recipeBook=new RecipeBook();
		Recipe recipe1 = new Recipe();
		Recipe recipe2 = new Recipe();
		recipe1.setName("Mary");
		recipe1.setAmtChocolate("2");
	    recipe1.setAmtCoffee("4");
	    recipe1.setAmtMilk("6");
		recipe1.setAmtSugar("8");
		recipe1.setPrice("100");
		recipeBook.addRecipe(recipe1);
		recipe2.setName("zaina");
	    recipe2.setAmtChocolate("2");
		recipe2.setAmtCoffee("3");
		recipe2.setAmtMilk("6");
		recipe2.setAmtSugar("5");
		recipe2.setPrice("70");
		assertEquals(null,recipeBook.editRecipe(1, recipe2) );
	}
	
}
