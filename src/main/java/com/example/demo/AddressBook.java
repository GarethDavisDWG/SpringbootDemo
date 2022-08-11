package com.example.demo;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> addressBook= new ArrayList();


    public AddressBook(){
        this.addressBook.add(new Contact("Gareth","Gareth@Gareth.com","I hate you all"));
        this.addressBook.add(new Contact("Alex","Alex@Gareth.com","Can I have a gold star"));
        this.addressBook.add(new Contact("Billy","Billy@Gareth.com","I claim this land in the name of the republic of Billy"));
        this.addressBook.add(new Contact("Ash","Ash@Gareth.com","1100101001001001010010001001000100100111000101010"));
        this.addressBook.add(new Contact("Tom","Tom@Gareth.com","Whoops"));
    }

    public List<Contact> getAddressBook(){
        return this.addressBook;
    }

    public String toString(){
        String json = new Gson().toJson(addressBook);
        return  json;
    }

    public void addContact(Contact c){
        this.addressBook.add(c);
    }

    public void changeContact(int id,Contact c){
        this.addressBook.set(id,c);
    }


}
