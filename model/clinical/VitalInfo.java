package model.clinical;

public class VitalInfo {
    private String pressure;
    private int temp;
    private String pulse;
    private String o2; 

    public VitalInfo(String pressure, int temp, String pulse, String o2) {
        this.pressure = pressure;
        this.temp = temp;
        this.pulse = pulse;
        this.o2 = o2;
    }

    public String getPressure() { return pressure; }
    public void setPressure(String pressure) { this.pressure = pressure; }

    public int getTemp() { return temp; }
    public void setTemp(int temp) { this.temp = temp; }

    public String getPulse() { return pulse; }
    public void setPulse(String pulse) { this.pulse = pulse; }

    public String getO2() { return o2; }
    public void setO2(String o2) { this.o2 = o2; }

