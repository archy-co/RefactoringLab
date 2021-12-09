package bills;

public class Bill10 extends BillGeneral implements Bill {
    private Bill nextBill = null;

    public void setNext(Bill nextBillL) {
        nextBill = nextBillL;
    }

    public int process(int amount) {
        return super.process(amount, nextBill, 10);
    }
}
