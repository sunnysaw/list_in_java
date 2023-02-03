/*
Question : Write a program to print detail of books and the detail of books are given.
________________________________________________________________________________________
NOTE : By using list interface.
 */

import java.util.ArrayList;
import java.util.List;
class Book {
    int id;
    String name,author,publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
public class Main {
    public static void main(String[] args) {
        List<Book> List = new ArrayList<Book>();
        System.out.println();
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        //Adding Books to list
        List.add(b1);
        List.add(b2);
        List.add(b3);
        //Traversing list
        for(Book b:List){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}