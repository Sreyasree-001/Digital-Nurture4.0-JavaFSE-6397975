package model;

public class Customer {
    private long id;
    private String name;
    private String email;

    public Customer(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "\nid=" + id + "\nname='" + name + "'\nemail='" + email + "'";
    }
}
