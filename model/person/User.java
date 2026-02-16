package model.person;
import model.enums.Role;

public class User extends Person {
    private Role role;
    private String username;
    private String password;

    public User(String name, String document, String email, String CellPhone, String birthdate, String address,
                Role role, String username, String password) {
        super(name, document, email, CellPhone, birthdate, address);
        this.role = role;
        this.username = username;
        this.password = password;
    }

    public Role getRole() { return role; }
    public void setRole(Role role) { this.role = role; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}


