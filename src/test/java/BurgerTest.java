import org.junit.Before;
import org.junit.Test;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BurgerTest {
    Burger burger = new Burger();
    private Bun bun ;
    private final List<Ingredient> ingredients = new ArrayList<>();

    @Before
    public void setTestData(){
        bun = new Bun("Бриош",150F);
        ingredients.add(new Ingredient(IngredientType.SAUCE, "hot sauce", 100));
        ingredients.add(new Ingredient(IngredientType.FILLING, "cutlet", 100));
        ingredients.add(new Ingredient(IngredientType.FILLING, "dinosaur", 200));
    }
    @Test
    public void setBunsTest(){
        burger.setBuns(bun);
        assertEquals(bun,burger.bun);
    }
    @Test
    public void addIngredientTest(){
        burger.addIngredient(ingredients.get(0));
        assertEquals(ingredients.get(0),burger.ingredients.get(0));
    }
    @Test
    public void removeIngredientTest(){
        burger.addIngredient(ingredients.get(0));
        burger.removeIngredient(0);
        assertTrue(burger.ingredients.isEmpty());
    }
    @Test
    public void moveIngredientTest(){
        burger.addIngredient(ingredients.get(0));
        burger.addIngredient(ingredients.get(1));
        burger.moveIngredient(1,0);
        assertEquals(ingredients.get(0).name,
                burger.ingredients.get(1).name);
    }



}
