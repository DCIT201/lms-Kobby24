package org.example;

public class Patron{
    private String name;
    private String id;
    private String email;
    private String phone;

    public Patron(String name, String id, String email, String phone){
        this.name = name;
        this.id = id;
        this.email = email;
        this.phone = phone;

    }
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public String getEmail(){
        return email;
    }
    public String getPhone(){
        return phone;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }



}
