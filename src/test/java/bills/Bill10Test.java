package bills;

import org.junit.Assert;
import org.junit.Test;

public class Bill10Test {

    @Test
    public void testBill10_1() {
        int amount = 20;
        Bill bill10 = new Bill10();

        int res = bill10.process(amount);

        Assert.assertEquals(2, res);
    }

    @Test
    public void testBill10_2() {
        int amount = 40;
        Bill bill10 = new Bill10();

        int res = bill10.process(amount);

        Assert.assertEquals(4, res);
    }

    @Test
    public void testBill10_3() {
        int amount = 0;
        Bill bill10 = new Bill10();

        int res = bill10.process(amount);

        Assert.assertEquals(0, res);
    }

}