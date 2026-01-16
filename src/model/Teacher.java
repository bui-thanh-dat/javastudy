package model;

import util.Borrowable;

import java.util.ArrayList;

public class Teacher extends Person implements Borrowable {
    private String teacherId;
    private String department;
    private ArrayList<Books> borrowedBooks = new ArrayList<>();
    private static final int MAX_TEACHER =  5;

    public Teacher(String id, String name, String teacherId, String department) {
        this.id = id;
        this.name = name;
        this.teacherId = teacherId;
        this.department = department;
    }
    @Override
    public void displayInfor(){
        System.out.println("model.Teacher ID: " + teacherId);
        System.out.println("model.Teacher Name: " + name);
        System.out.println("model.Teacher Department : " + department);
        System.out.println("Max books allowed: 5");
    }

    @Override
    public boolean borrowBook(Books book) {
        if(borrowedBooks.size() >= MAX_TEACHER) { return false; }
        if(!book.borrowOne()) return false;
        borrowedBooks.add(book);
        return true;
    }

    @Override
    public boolean returnBook(Books book) {
        if(!borrowedBooks.remove(book)) {
            return false;
        }
        book.returnOne();
        return true;
    }

    public ArrayList<Books> getBorrowedBooks() {
        return borrowedBooks;
    }
}
