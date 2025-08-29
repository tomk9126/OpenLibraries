//Represents a person registered at library

public class Member {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    //Constructor
    public Member(string name, String email) {
        this.name = firstName + lastName;
        this.email = email;
    }

    //Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
}
