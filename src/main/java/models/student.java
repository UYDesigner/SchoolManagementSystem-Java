package models;

public class student {
    int id;
    String name;

    String branch;
    String email;

    public student(int id, String name,  String branch, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.branch = branch;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
    @Override
    public String toString() {
        return "student{id=" + id + ", name='" + name + "', Branch='" + branch + "', emailid='" + email + "}";
    }
}
