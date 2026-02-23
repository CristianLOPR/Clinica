package model.policy;

public class Policy {
    private int id;
    private String status;
    private String vigency;   
    private Company company;

    public Policy(int id, String status, String vigency, Company company) {
        this.id = id;
        this.status = status;
        this.vigency = vigency;
        this.company = company;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getVigency() { return vigency; }
    public void setVigency(String vigency) { this.vigency = vigency; }

    public Company getCompany() { return company; }
    public void setCompany(Company company) { this.company = company; }
}


