package model;

import util.Borrowable;

import java.util.ArrayList;

public class Student extends Person implements Borrowable {
    private String studentId;
    private String className;
    private ArrayList<Books> borrowedBooks = new ArrayList<>() ;
    private static final int MAX_STUDENTS = 3;

    public Student(String id, String name, String studentId, String className) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.studentId = studentId;

    }

    @Override
    public void displayInfor(){
        System.out.println("model.Student ID: " + studentId);
        System.out.println("model.Student Name: "+ name);
        System.out.println("model.Student class: "+ className);
        System.out.println("Max books allowed: 3 ");
    }

    @Override
    public boolean borrowBook(Books book){
        if(borrowedBooks.size() >= MAX_STUDENTS) return false;

        if(!book.borrowOne()) return false;
        borrowedBooks.add(book);
        return true;
    }

    @Override
    public boolean returnBook(Books book){
        if(!borrowedBooks.remove(book)) return false;
        book.returnOne();
        return true;
    }

    public ArrayList<Books> getBorrowedBooks() {
        return borrowedBooks;
    }
}
