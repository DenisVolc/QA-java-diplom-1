package burger;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MoveIngredientParmTest extends CommonTests {
    private int index;
    private int newIndex;
    private int placeForIngredient0;
    private int placeForIngredient1;

    public MoveIngredientParmTest(int index, int newIndex, int placeForIngredient0, int placeForIngredient1 ) {
        this.index = index;
        this.newIndex = newIndex;
        this.placeForIngredient0 = placeForIngredient0;
        this.placeForIngredient1 = placeForIngredient1;
    }

    @Parameterized.Parameters
    public static Object[][] testIndexes(){
        return new Object[][]{
                {1,0,1,0},
                {0,1,1,0},
                {0,0,0,1}
        };
    }
    @Before
    public void setUp(){
        setTestData();
    }

    @Test
    public void moveIngredientTest(){
        burger.addIngredient(ingredient0);
        burger.addIngredient(ingredient1);

        burger.moveIngredient(index,newIndex);

        assertEquals(ingredient0, burger.ingredients.get(placeForIngredient0));
        assertEquals(ingredient1, burger.ingredients.get(placeForIngredient1));
    }
}
