package org.example;


public class Buyers {

    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Buyers(String name, String surname){
        this.name = name;
        this.surname = surname;
    }


}
