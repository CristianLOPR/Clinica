package model.clinical;
import model.person.User;

public class ClinicalRecord {
    private String date;
    private User doctor;
    private String motive;
    private String synthoms;or
    private String diagnosis;

    public ClinicalRecord(String date, User doctor, String motive, String synthoms, String diagnosis) {
        this.date = date;
        this.doctor = doctor;
        this.motive = motive;
        this.synthoms = synthoms;
        this.diagnosis = diagnosis;
    }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public User getDoctor() { return doctor; }
    public void setDoctor(User doctor) { this.doctor = doctor; }

    public String getMotive() { return motive; }
    public void setMotive(String motive) { this.motive = motive; }

    public String getSynthoms() { return synthoms; }
    public void setSynthoms(String synthoms) { this.synthoms = synthoms; }

    public String getDiagnosis() { return diagnosis; }
    public void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }
