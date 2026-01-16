package service;

import model.Books;
import model.Person;

import java.util.ArrayList;

public class Library {
    private ArrayList<Books> books = new ArrayList<>();
    private ArrayList<Person> people = new ArrayList<>();

    // ====BOOK=====
    public void addBook(Books book){
        books.add(book);
    }
    public boolean removeBook(String bookID){
        Books book = findBookById(bookID);
        if(book == null){ return false; }
        books.remove(book);
        return true;
    }
    public boolean updateBook(String bookId, String newTitle, String newAuthor){
        Books book = findBookById(bookId);
        if(book == null){ return false; }

        book.setTitle(newTitle);
        book.setAuthor(newAuthor);
        return true;
    }
    public Books findBookById(String bookId){
        for(Books book : books){
            if(book.getBookId().equalsIgnoreCase(bookId))
                return book;
        }
        return null;
    }
    public Books findBooksByAuthor(String author){
        for(Books book : books){
            if(book.getAuthor().equalsIgnoreCase(author))
                return book;
        }
        return null ;
    }
    public Books findBookByTitle(String title){
        for(Books book : books){
            if(book.getTitle().equalsIgnoreCase(title))
                return book;
        }
        return null;
    }

    public void showAllBooks(){
        if(books.isEmpty()){
            System.out.println("No books found");
            return;
        }

        for(Books book : books){
            System.out.println("---------------");
            book.displayInfor();
        }
    }

    //======PERSON======

    public void addPerson(Person person){
        people.add(person);
    }
    public Person findPersonById(String personId){
        for(Person person : people){
            if(person.getId().equalsIgnoreCase(personId)){
                return person;
            }
        }
        return null;
    }

    public void showAllPersons(){
        if(people.isEmpty()){
            System.out.println("No people found");
            return;
        }
        for(Person person : people){
            System.out.println("-------------");
            person.displayInfor();
        }
    }
    // ============ BORROW / RETURN ==========
    public boolean borrowBook(String personId, String bookId){
        Person person = findPersonById(personId);
        Books book = findBookById(bookId);

        if(person == null || book == null){
            return false;
        }
        return person.borrowBook(book);
    }

    public boolean returnBook(String personId, String bookId){
        Person person = findPersonById(personId);
        Books book = findBookById(bookId);

        if(person == null || book == null){
            return false;
        }
        return person.returnBook(book);
    }

}
