package bills;

public interface Bill {

    public void setNext(Bill nextBillL);
    public int process(int amount);
}
