package bills;

public class Bill5 extends BillGeneral implements Bill {
    private Bill nextBill;

    public void setNext(Bill nextBillL) {
        nextBill = nextBillL;
    }

    public int process(int amount) {
        return super.process(amount, this.nextBill, 5);
    }
}
