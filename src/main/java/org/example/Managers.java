package org.example;

public class Managers {
private String name;
private String surname;
private int number;
private int pin;

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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public Managers(String name, String surname, int number, int pin){
    this.name = name;
    this.surname = surname;
    this.pin = pin;
    this.number = number;
}
}
