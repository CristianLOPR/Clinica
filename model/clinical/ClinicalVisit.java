package model.clinical;
import model.person.User;
import model.invoice.Item;

public class ClinicalVisit {
    private String patient;
    private User nurse;
    private VitalInfo vitalInfo;
    private String order;
    private Item item;
    private String obs;

    public ClinicalVisit(String patient, User nurse, VitalInfo vitalInfo,
                         String order, Item item, String obs) {
        this.patient = patient;
        this.nurse = nurse;
        this.vitalInfo = vitalInfo;
        this.order = order;
        this.item = item;
        this.obs = obs;
    }

    public String getPatient() { return patient; }
    public void setPatient(String patient) { this.patient = patient; }

    public User getNurse() { return nurse; }
    public void setNurse(User nurse) { this.nurse = nurse; }

    public VitalInfo getVitalInfo() { return vitalInfo; }
    public void setVitalInfo(VitalInfo vitalInfo) { this.vitalInfo = vitalInfo; }

    public String getOrder() { return order; }
    public void setOrder(String order) { this.order = order; }

    public Item getItem() { return item; }
    public void setItem(Item item) { this.item = item; }

    public String getObs() { return obs; }
    public void setObs(String obs) { this.obs = obs; }
