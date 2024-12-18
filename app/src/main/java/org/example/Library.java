package org.example;


public class Library {
    private String name;
    private String address;
    private String operatingHours;
    private String[] books;
    private String[] patrons;
    public Library(String name, String address, String operatingHours) {
        this.name = name;
        this.address = address;
        this.operatingHours = operatingHours;

    }
    public void setBooks(String[] books) {
        this.books = books;
    }
    public void setPatrons(String[] patrons) {
        this.patrons = patrons;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getOperatingHours() {
        return operatingHours;
    }
    public String[] getBooks() {
        return books;
    }
    public String[] getPatrons() {
        return patrons;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Operating Hours: " + operatingHours);

    }

}
