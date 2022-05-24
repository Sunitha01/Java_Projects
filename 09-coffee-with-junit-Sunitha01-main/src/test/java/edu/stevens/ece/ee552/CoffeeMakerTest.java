
package edu.stevens.ece.ee552;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CoffeeMakerTest {
    // Write some tests here
    @Test
    void addCoffeTest( ) {
        CoffeeMaker cm = new CoffeeMaker();
        cm.addCoffee(1);
        assertEquals(1,cm.getScoopsCoffee());

    }
    @Test
    void addWaterTest( ) {
        CoffeeMaker cm = new CoffeeMaker();
        cm.addWater(3);
        assertEquals(3,cm.getCupsWater());

    }

    @Test
    void cupsCoffeeTest( ) {
        CoffeeMaker cm = new CoffeeMaker();
        cm.addWater(3);

        cm.brewCoffee();
        cm.pour(2);
        System.out.println(cm.getCupsCoffee());
        assertEquals(1,cm.getCupsCoffee());

    }

    @Test
    void numCupsTest( ) {
        CoffeeMaker cm = new CoffeeMaker();
        cm.addWater(1);
        cm.brewCoffee();
        assertEquals(1,cm.getCupsCoffee());
        assertThrows(IllegalStateException.class,() -> cm.pour(2));

   }

}
