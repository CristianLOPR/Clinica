package model.person;

import model.policy.Policy;
import model.policy.Contact;

public class Patient extends Person {
    private String gender;
    private Contact contact; 
    private Policy policy;

    public Patient(String name, String document, String email, String CellPhone, String birthdate, String address,
                   String gender, Contact contact, Policy policy) {
        super(name, document, email, CellPhone, birthdate, address);
        this.gender = gender;
        this.contact = contact;
        this.policy = policy;
    }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public Contact getContact() { return contact; }
    public void setContact(Contact contact) { this.contact = contact; }

    public Policy getPolicy() { return policy; }
    public void setPolicy(Policy policy) { this.policy = policy; }
}
