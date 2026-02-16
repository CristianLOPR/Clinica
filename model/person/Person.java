package model.person;

public abstract class Person {
    private String name;
    private String document;
    private String email;
    private String Cellphone;
    private String birthdate;
    private String address;

    public Person(String name, String document, String email, String Cellphone, String birthdate, String address) {
        this.name = name;
        this.document = document;
        this.email = email;
        this.CellPhone = Cellphone;
        this.birthdate = birthdate;
        this.address = address;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDocument() { return document; }
    public void setDocument(String document) { this.document = document; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getCellPhone() { return CellPhone; }
    public void setCellphone(String Cellphone) { this.Cellphone = Cellphone; }

    public String getBirthdate() { return birthdate; }
    public void setBirthdate(String birthdate) { this.birthdate = birthdate; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
}



