package burger;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.*;
//@RunWith(MockitoJUnitRunner.class)
public class CommonTests {
    Burger burger = new Burger();
    @Mock
    protected Bun bun;
    @Mock
    protected Ingredient ingredient0;
    @Mock
    protected Ingredient ingredient1;


    @Before
    public void setTestData(){
        MockitoAnnotations.initMocks(this);

        Mockito.when(bun.getName()).thenReturn("Бриошь");
        Mockito.when(bun.getPrice()).thenReturn(150F);

        Mockito.when(ingredient0.getName()).thenReturn("hot sauce");
        Mockito.when(ingredient0.getType()).thenReturn(IngredientType.SAUCE);
        Mockito.when(ingredient0.getPrice()).thenReturn(100F);

        Mockito.when(ingredient1.getName()).thenReturn("cutlet");
        Mockito.when(ingredient1.getType()).thenReturn(IngredientType.FILLING);
        Mockito.when(ingredient1.getPrice()).thenReturn(300F);

    }
    @Test
    public void setBunsTest(){
        burger.setBuns(bun);
        assertEquals(bun.getName(),burger.bun.getName());
    }
    @Test
    public void addIngredientTest(){
        burger.addIngredient(ingredient0);
        assertTrue(burger.ingredients.contains(ingredient0));
    }
    @Test
    public void removeIngredientTest(){
        burger.addIngredient(ingredient0);
        burger.removeIngredient(0);
        assertFalse(burger.ingredients.contains(ingredient0));
    }
    @Test
    public void getPriceTest(){
        burger.setBuns(bun);
        burger.addIngredient(ingredient0);
        float expectedPrice = bun.getPrice() * 2;
        expectedPrice += ingredient0.getPrice();
        assertEquals(expectedPrice,burger.getPrice(),0F);
    }
    @Test
    public void getReceiptTest(){
        burger.setBuns(bun);
        burger.addIngredient(ingredient0);

        float expectedPrice = bun.getPrice() * 2;
        expectedPrice += ingredient0.getPrice();

        String expectedReceipt =
                String.format("(==== %s ====)%n", bun.getName()) +
                String.format("= %s %s =%n", ingredient0.getType().toString().toLowerCase(), ingredient0.getName()) +
                String.format("(==== %s ====)%n", bun.getName()) +
                String.format("%nPrice: %f%n", expectedPrice);

        assertEquals(expectedReceipt,burger.getReceipt());
    }
//







}
