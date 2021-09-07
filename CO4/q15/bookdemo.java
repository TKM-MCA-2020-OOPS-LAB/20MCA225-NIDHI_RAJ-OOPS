import java.util.*;  
class Book 
{  
int id;  
String name;
String author;
String publisher;  
int quantity;  
public Book(int id, String name, String author, String publisher, int quantity) 
{  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
}  
public class bookdemo
{  
public static void main(String[] args) 
{  
    LinkedHashSet<Book> b=new LinkedHashSet<Book>();  
    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
    b.add(b1);  
    b.add(b2);  
    b.add(b3);   
    for(Book buk:b){  
    System.out.println(buk.id+" "+buk.name+" "+buk.author+" "+buk.publisher+" "+buk.quantity);  
    }  
}  
}  