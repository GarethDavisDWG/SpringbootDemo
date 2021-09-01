package com.example.demo;

public class Contact {
    private String name;
    private String email;
    private String catchPhrase;

    public Contact(String name,String email,String catchPhrase){
        this.name = name;
        this.email = email;
        this.catchPhrase = catchPhrase;
    }

    @Override
    public String toString() {
        return "{" +
                "\"name\"= \"" + name +
                "\", \"email\"=\"" + email +
                "\", \"catchPhrase\"=\"" + catchPhrase +
                "\"}";
    }
}
