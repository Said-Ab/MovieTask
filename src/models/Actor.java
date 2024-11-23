package models;

public class Actor {
    private String name;
    private String role;


    public  Actor(){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Actor(String name, String role) {
        this.name = name;
        this.role = role;
    }
    @Override
    public String toString() {
        return
                "name='" + name +
                ", role='" + role
                ;
    }
}
