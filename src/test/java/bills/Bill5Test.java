package bills;

import org.junit.Assert;
import org.junit.Test;

public class Bill5Test {
    @Test
    public void testBill5_1() {
        int amount = 20;
        Bill bill5 = new Bill5();

        int res = bill5.process(amount);

        Assert.assertEquals(4, res);
    }

    @Test
    public void testBill5_2() {
        int amount = 40;
        Bill bill5 = new Bill5();

        int res = bill5.process(amount);

        Assert.assertEquals(8, res);
    }

    @Test
    public void testBill5_3() {
        int amount = 0;
        Bill bill5 = new Bill5();

        int res = bill5.process(amount);

        Assert.assertEquals(0, res);
    }

}