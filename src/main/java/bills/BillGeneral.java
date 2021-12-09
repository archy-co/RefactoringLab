

// BillGeneral

package bills;

public class BillGeneral implements Bill {
    private Bill nextBill;
    public BillGeneral() {}

    public int process(int amount) { return 0; }

    @Override
    public void setNext(Bill nextBillL) {
        nextBill = nextBillL;
    }

    public int process(int amount, Bill nextBillL, int divisor) {
        int curr = amount / divisor;
        int rem = amount - divisor*curr;
        if (rem != 0) {
            return curr+nextBillL.process(rem);
        }
        return curr;
    }
}
