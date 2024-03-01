import org.junit.Before;
import org.junit.Test;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

public class BunTests {
    private final String name = "such bun";
    private final float price = 100F;
    private Bun bun;
    @Before
    public void createBun(){
        bun = new Bun(name, price);
    }
    @Test
    public void getNameTest(){
        assertEquals(name,bun.getName());
    }
    @Test
    public void getPriceTest(){
        assertEquals(price,bun.getPrice(),0f);
    }

}
