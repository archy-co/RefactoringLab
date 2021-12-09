package bills;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class BillGeneralTest {

    @Test
    public void testAll1() {
        int amount = 25;
        Bill bill20 = new Bill20();
        Bill bill10 = new Bill10();
        Bill bill5 = new Bill5();

        bill20.setNext(bill10);
        bill10.setNext(bill5);

        int res = bill20.process(amount);

        Assert.assertEquals(2, res);
    }

     @Test
     public void testAll2() {
         int amount = 35;
         Bill bill20 = new Bill20();
         Bill bill10 = new Bill10();
         Bill bill5 = new Bill5();

         bill20.setNext(bill10);
         bill10.setNext(bill5);

         int res = bill20.process(amount);

         Assert.assertEquals(3, res);
     }

    @Test
    public void testAll3() {
        int amount = 115;
        Bill bill20 = new Bill20();
        Bill bill10 = new Bill10();
        Bill bill5 = new Bill5();

        bill20.setNext(bill10);
        bill10.setNext(bill5);

        int res = bill20.process(amount);

        Assert.assertEquals(7, res);
    }
}