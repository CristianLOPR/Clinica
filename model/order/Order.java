package model.order;
import java.util.List;
import model.person.Patient;
import model.person.User;

public class Order {
    private int id;
    private List<OrderItem> orderItem;
    private Patient patient;
    private User doctor;
    private String date;

    public Order(int id, List<OrderItem> orderItem, Patient patient, User doctor, String date) {
        this.id = id;
        this.orderItem = orderItem;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public List<OrderItem> getOrderItem() { return orderItem; }
    public void setOrderItem(List<OrderItem> orderItem) { this.orderItem = orderItem; }

    public Patient getPatient() { return patient; }
    public void setPatient(Patient patient) { this.patient = patient; }

    public User getDoctor() { return doctor; }
    public void setDoctor(User doctor) { this.doctor = doctor; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
}
