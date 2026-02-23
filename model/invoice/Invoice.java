package model.invoice;
import java.util.List;
import model.person.Patient;
import model.person.User;

public class Invoice {
    private Patient patient;
    private User doctor;
    private List<Item> Order;
    private String Copay;
    private String date;
    private double total;

    public Invoice(Patient patient, User doctor, List<Item> Order, String Copay, String date, double total) {
        this.patient = patient;
        this.doctor = doctor;
        this.Order = Order;
        this.Copay = Copay;
        this.date = date;
        this.total = total;
    }

    public Patient getPatient() { return patient; }
    public void setPatient(Patient patient) { this.patient = patient; }

    public User getDoctor() { return doctor; }
    public void setDoctor(User doctor) { this.doctor = doctor; }

    public List<Item> getOrder() { return Order; }
    public void setOrder(List<Item> Order) { this.Order = Order; }

    public String getCopy() { return Copay; }
    public void setCopy(String Copay) { this.Copay = Copay; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }
}
