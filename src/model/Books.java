package model;

public class Books {
    private String bookId;
    private String title;
    private String author;
    private int quantity;

    public Books(String bookId, String title, String author, int quantity){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.quantity = quantity;
    }

    public boolean isAvailable(){
        return quantity > 0;
    }
    public void displayInfor(){
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Quantity: " + quantity);
        System.out.println("Status: "+ (isAvailable() ? "Available" : "Not Available"));
    }

    //getter ( cần cho library/borrowable dùng )

    public String getBookId(){ return bookId; }

    public String getTitle(){ return title; }
    public void setTitle(String title){ this.title = title; }

    public String getAuthor(){ return author; }
    public void setAuthor(String author){ this.author = author; }

    public int getQuantity(){ return quantity; }

    public boolean borrowOne(){
        if(!isAvailable()){ return false; }
        quantity--;
        return true;
    }
    public void returnOne(){
        quantity++;
    }
}
