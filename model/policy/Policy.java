package model.policy;

public class Policy {
    private String code;
    private String status;
    private String vigency;

    public Policy(String code, String status, String vigency) {
        this.code = code;
        this.status = status;
        this.vigency = vigency;
    }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getVigency() { return vigency; }
    public void setVigency(String vigency) { this.vigency = vigency; }
}

