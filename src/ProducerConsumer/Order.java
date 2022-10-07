package ProducerConsumer;

public class Order {
    private String intemDescr;
    private int qty;

    public Order(String intemDescr, int qty) {
        this.intemDescr = intemDescr;
        this.qty = qty;
    }

    public String getIntemDescr() {
        return intemDescr;
    }

    public void setIntemDescr(String intemDescr) {
        this.intemDescr = intemDescr;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Order{" +
                "intemDescr='" + intemDescr + '\'' +
                ", qty=" + qty +
                '}';
    }
}
