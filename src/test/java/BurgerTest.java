import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BurgerTest {
    Burger burger = new Burger();
    @Mock
    private Bun bunX;
    @Mock
    private Ingredient ingredient;
    private final List<Ingredient> ingredients = new ArrayList<>();
    private String bunName = "Бриошь";
    private float bunPrice = 150F;

    @Before
    public void setTestData(){
        ingredients.add(new Ingredient(IngredientType.SAUCE, "hot sauce", 100));
        ingredients.add(new Ingredient(IngredientType.FILLING, "cutlet", 100));
        ingredients.add(new Ingredient(IngredientType.FILLING, "dinosaur", 200));
    }
    @Test
    public void setBunsTest(){
        Mockito.when(bunX.getName()).thenReturn(bunName);

        burger.setBuns(bunX);
        assertEquals(bunX.getName(),burger.bun.getName());
    }
//    @Test
//    public void addIngredientTest(){
//        burger.addIngredient(ingredient);
//        assertTrue(burger.ingredients.contains(ingredient));
//    }
//    @Test
//    public void removeIngredientTest(){
//        burger.addIngredient(ingredients.get(0));
//        burger.removeIngredient(0);
//        assertTrue(burger.ingredients.isEmpty());
//    }
//    @Test
//    public void moveIngredientTest(){
//        burger.addIngredient(ingredients.get(0));
//        burger.addIngredient(ingredients.get(1));
//        burger.moveIngredient(1,0); //todo можно поиздеваться над методом
//        assertEquals(ingredients.get(0).name,
//                burger.ingredients.get(1).name);
//    }
//    @Test
//    public void getPriceTest(){ //todo можно поиздеваться над методом
//        burger.setBuns(bun);
//        burger.addIngredient(ingredients.get(0));
//        float expectedPrice = bun.getPrice() * 2;
//        expectedPrice += ingredients.get(0).getPrice();
//        assertEquals(expectedPrice,burger.getPrice(),0F);
//    }
//    @Test
//    public void getReceiptTest(){
//        burger.setBuns(bun);
//        burger.addIngredient(ingredients.get(0));
//
//        float expectedPrice = bun.getPrice() * 2;
//        expectedPrice += ingredients.get(0).getPrice();
//
//        StringBuilder expectedReceipt = new StringBuilder(String.format("(==== %s ====)%n", bun.getName()));
//        for (Ingredient ingredient : burger.ingredients) {
//            expectedReceipt.append(String.format("= %s %s =%n", ingredient.getType().toString().toLowerCase(),
//                    ingredient.getName()));
//        }
//        expectedReceipt.append(String.format("(==== %s ====)%n", bun.getName()));
//        expectedReceipt.append(String.format("%nPrice: %f%n", expectedPrice));
//
//        assertEquals(expectedReceipt.toString(),burger.getReceipt());
//    }
//
//
//
//
//
//
//
//
}
