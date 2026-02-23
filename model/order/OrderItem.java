package model.order;
import model.invoice.Item;

public class OrderItem {
    private int orderId;
    private int itemNumber;
    private Item item;

    public OrderItem(int orderId, int itemNumber, Item item) {
        this.orderId = orderId;
        this.itemNumber = itemNumber;
        this.item = item;
    }

    public int getOrderId() { return orderId; }
    public void setOrderId(int orderId) { this.orderId = orderId; }

    public int getItemNumber() { return itemNumber; }
    public void setItemNumber(int itemNumber) { this.itemNumber = itemNumber; }

    public Item getItem() { return item; }
    public void setItem(Item item) { this.item = item; }
}
