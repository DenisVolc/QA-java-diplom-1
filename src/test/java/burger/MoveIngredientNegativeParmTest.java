package burger;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertThrows;


@RunWith(Parameterized.class)
public class MoveIngredientNegativeParmTest extends CommonTests {
    private int index;
    private int newIndex;

    public MoveIngredientNegativeParmTest(int index, int newIndex ) {
        this.index = index;
        this.newIndex = newIndex;
    }

    @Parameterized.Parameters
    public static Object[][] testIndexes(){
        return new Object[][]{
                {-1,0},
                {0,-1},
                {-1,-1}
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

        assertThrows(IndexOutOfBoundsException.class,()-> {
            burger.moveIngredient(index,newIndex);;
        } );
    }
}

