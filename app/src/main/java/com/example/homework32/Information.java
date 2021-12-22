package com.example.homework32;

public class Information {
    private String name;
    private String surname;
    private int image;

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

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Information(String name, String surname, int image) {
        this.name = name;
        this.surname = surname;
        this.image = image;
    }
}
