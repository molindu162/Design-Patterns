package IteratorPattern;

public class Profile {
    private String name;
    private String ID;
    private String email;

    public Profile(String name, String ID, String email) {
        this.name = name;
        this.ID = ID;
        this.email = email;
    }
    public String getID() {
        return ID;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }


}
