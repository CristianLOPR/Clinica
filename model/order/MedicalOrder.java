package model.order;

public class MedicalOrder extends Order {
    private String Dose;
    private String Duration;

    public MedicalOrder(int id, java.util.List<OrderItem> orderItem, 
                        model.person.Patient patient, model.person.User doctor, String date,
                        String Dose, String Duration) {
        super(id, orderItem, patient, doctor, date);
        this.Dose = Dose;
        this.Duration = Duration;
    }

    public String getDose() { return Dose; }
    public void setDose(String Dose) { this.Dose = Dose; }

    public String getDuration() { return Duration; }
    public void setDuration(String Duration) { this.Duration = Duration; }
}
