package model.person;
import model.policy.Policy;

public class Patient extends Person {
    private String gender;
    private String Contact;
    private Policy policy;

    public Patient(String name, String document, String email, String CellPhone, String birthdate, String address,
                   String gender, String Contact, Policy policy) {
        super(name, document, email, CellPhone, birthdate, address);
        this.gender = gender;
        this.Contact = Contact;
        this.policy = policy;
    }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getContact() { return Contact; }
    public void setContact(String Contact) { this.Contact = Contact; }

    public Policy getPolicy() { return policy; }
    public void setPolicy(Policy policy) { this.policy = policy; }
}
