package model.order;
import model.order.Specialist;

public class ProcedureOrder extends Order {
    private int quantity;
    private String frecuency;
    private boolean specialistRequired;
    private Specialist specialist;

    public ProcedureOrder(int id, java.util.List<OrderItem> orderItem,
                          model.person.Patient patient, model.person.User doctor, String date,
                          int quantity, String frecuency, boolean specialistRequired, Specialist specialist) {
        super(id, orderItem, patient, doctor, date);
        this.quantity = quantity;
        this.frecuency = frecuency; 
        this.specialistRequired = specialistRequired;
        this.specialist = specialist;
    }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public String getFrecuency() { return frecuency; } 
    public void setFrecuency(String frecuency) { this.frecuency = frecuency; } 

    public boolean isSpecialistRequired() { return specialistRequired; }
    public void setSpecialistRequired(boolean specialistRequired) { this.specialistRequired = specialistRequired; }

    public Specialist getSpecialist() { return specialist; }
    public void setSpecialist(Specialist specialist) { this.specialist = specialist; }
}
