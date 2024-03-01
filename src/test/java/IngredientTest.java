import org.junit.Before;
import org.junit.Test;

import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

public class IngredientTest {
    private final String name = "such bun";
    private final float price = 100F;
    private IngredientType type = IngredientType.SAUCE;
    private Ingredient ingredient;
    @Before
    public void createIngredient(){
        ingredient = new Ingredient(type,name,price);
    }
    @Test
    public void getNameTest(){
        assertEquals(name,ingredient.getName());
    }
    @Test
    public void getPriceTest(){
        assertEquals(price,ingredient.getPrice(),0f);
    }
    @Test
    public void getTypeTest(){
        assertEquals(type,ingredient.getType());
    }


}
