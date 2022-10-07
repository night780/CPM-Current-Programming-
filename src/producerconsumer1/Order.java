package producerconsumer1;

public class Order {
    private String itemDescr;
    private int qty;

    public Order(String itemDescr, int qty) {
        this.itemDescr = itemDescr;
        this.qty = qty;
    }

    public void setItemDescr(String itemDescr) {
        this.itemDescr = itemDescr;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getItemDescr() {
        return itemDescr;
    }

    public int getQty() {
        return qty;
    }

    @Override
    public String toString() {
        return "Order{" +
                "itemDescr='" + itemDescr + '\'' +
                ", qty=" + qty +
                '}';
    }
}
