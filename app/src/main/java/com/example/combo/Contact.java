package com.example.combo;

public class Contact {

    private String Name;
    private String Phone;
    private int photo;

    public Contact() {

    }

    public Contact(String name, String phone, int photo) {
        Name = name;
        Phone = phone;
        this.photo = photo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
