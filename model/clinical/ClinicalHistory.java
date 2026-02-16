package model.clinical;
import java.util.List;

public class ClinicalHistory {
    private String document;
    private List<ClinicalRecord> clinicalRecords;

    public ClinicalHistory(String document, List<ClinicalRecord> clinicalRecords) {
        this.document = document;
        this.clinicalRecords = clinicalRecords;
    }

    public String getDocument() { return document; }
    public void setDocument(String document) { this.document = document; }

    public List<ClinicalRecord> getClinicalRecords() { return clinicalRecords; }
    public void setClinicalRecords(List<ClinicalRecord> clinicalRecords) { this.clinicalRecords = clinicalRecords; }
}
