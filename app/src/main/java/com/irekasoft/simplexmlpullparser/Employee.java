package com.irekasoft.simplexmlpullparser;

/**
 * Created by hijazi on 30/5/15.
 */
public class Employee {

    private String name;
    private int id;
    private String department;
    private String type;
    private String email;

    @Override
    public String toString() {
        return id + ": " + name + "\n" + department + "-" + type
                + "\n" + email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
