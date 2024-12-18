/*
 * This should be your main class where all your objects will be created
 */
package org.example;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {


        Library library = new Library("K24","P.O.Box 125","7am-7pm");
        library.display();

        Book book1 = new Book("Joe again","@Joe",2024);
        book1.setAvailable(true);
        book1.display();

        Patron p1 = new Patron("Pual","201","pual@joe","+1567 84");
        System.out.println("The Patron on duty is "+p1.getName());


    }
}
