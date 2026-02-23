package model.order;

public class SupportOrder extends Order {
    private boolean specialistRequired;
    private Specialist specialist;
    private int Quantity;

    public SupportOrder(int id, java.util.List<OrderItem> orderItem,
                        model.person.Patient patient, model.person.User doctor, String date,
                        boolean specialistRequired, Specialist specialist, int Quantity) {
        super(id, orderItem, patient, doctor, date);
        this.specialistRequired = specialistRequired;
        this.specialist = specialist;
        this.Quantity = Quantity;
    }

    public boolean isSpecialistRequired() { return specialistRequired; }
    public void setSpecialistRequired(boolean specialistRequired) { this.specialistRequired = specialistRequired; }

    public Specialist getSpecialist() { return specialist; }
    public void setSpecialist(Specialist specialist) { this.specialist = specialist; }

    public int getQuantity() { return Quantity; }
    public void setQuantity(int Quantity) { this.Quantity = Quantity; }
}
