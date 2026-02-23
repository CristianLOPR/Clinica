package model.order;

public class Specialist {
    private int id;
    private String Type;

    public Specialist(int id, String Type) {
        this.id = id;
        this.Type = Type;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getType() { return Type; }
    public void setType(String Type) { this.Type = Type; }
}
