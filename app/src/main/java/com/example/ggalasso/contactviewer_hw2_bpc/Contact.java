package com.example.ggalasso.contactviewer_hw2_bpc;
//Pankaj
/**
 * Created by ggalasso on 2/13/15.
 */
public class Contact {
    public static Contact[] getAll() {
        return new Contact[] {
            new Contact("Malcolm Reynolds", "Captain", "123-456-7890", 2),
            new Contact("Tom", "Doctor", "123-456-7300", 2),
            new Contact("Rob", "Pirate", "123-456-7200", 3),
            new Contact("Bob Doe", "Cop", "123-456-7100", 4),
            new Contact("Tommy Malone", "Engineer", "123-456-7400", 5)
        };
    }

    public Contact(String name, String title, String phone, int id) {
        this.name = name;
        this.title = title;
        this.phone = phone;
        this.id = id;
    }

    private String name;
    private String title;
    private String email;
    private String phone;
    private String twitterId;
    private int id;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTwitterId() {
        return twitterId;
    }

    public void setTwitterId(String twitterId) {
        this.twitterId = twitterId;
    }
}
