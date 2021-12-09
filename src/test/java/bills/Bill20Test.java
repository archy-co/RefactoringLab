package bills;

import org.junit.Assert;
import org.junit.Test;

public class Bill20Test {

    @Test
    public void testBill20_1() {
        int amount = 20;
        Bill bill20 = new Bill20();

        int res = bill20.process(amount);

        Assert.assertEquals(1, res);
    }

    @Test
    public void testBill20_2() {
        int amount = 40;
        Bill bill20 = new Bill20();

        int res = bill20.process(amount);

        Assert.assertEquals(2, res);
    }

    @Test
    public void testBill20_3() {
        int amount = 0;
        Bill bill20 = new Bill20();

        int res = bill20.process(amount);

        Assert.assertEquals(0, res);
    }

}