import model.Books;
import model.Student;
import model.Teacher;
import service.Library;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        //demo data
        //demo data ( để khỏi nhập tay )
        lib.addBook(new Books("B01","Clean Code","Robert Martin",2));
        lib.addBook(new Books("B02","Effective Java","John Smith",3));

        lib.addPerson(new Student("P01","Nguyen Van A", "SV01", "SE18"));
        lib.addPerson(new Teacher("P02","Bui Thanh DaT", "GV01", "Garden House"));

        while(true){
            try {
                System.out.println("\n ========= LIBRARY MANAGEMENT SYSTEM =======\n");
                System.out.println("1. Add Book");
                System.out.println("2. Display List of Books");
                System.out.println("3. Add Person");
                System.out.println("4. Borrow Book");
                System.out.println("5. Return Book");
                System.out.println("6. search for Books ");
                System.out.println("0. Exit!!! \n");
                System.out.println("Choose: ");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1 -> {
                        System.out.println("BookId: ");
                        String bookId = sc.nextLine();
                        System.out.println("Title: ");
                        String title = sc.nextLine();
                        System.out.println("Author: ");
                        String author = sc.nextLine();
                        System.out.println("Quantity: ");
                        int quantity = sc.nextInt();
                        sc.nextLine();
                        lib.addBook(new Books(bookId, title, author, quantity));
                        System.out.println("Added Book");
                    }
                    case 2 -> {
                        lib.showAllBooks();
                    }
                    case 3 -> {
                        try {
                            System.out.println("1-Student, 2-Teacher");
                            int choice2 = sc.nextInt();
                            sc.nextLine();
                            System.out.println("PersonId: ");
                            String personId = sc.nextLine();
                            System.out.println("PersonName: ");
                            String personName = sc.nextLine();

                            if (choice2 == 1) {
                                System.out.println("Enter Student Id: ");
                                String studentId = sc.nextLine();
                                System.out.println("Enter Student Name: ");
                                String studentName = sc.nextLine();
                                lib.addPerson(new Student(personId, personName, studentId, studentName));
                            } else if (choice2 == 2) {
                                System.out.println("Enter Teacher Id: ");
                                String teacherId = sc.nextLine();
                                System.out.println("Enter Teacher Name: ");
                                String teacherName = sc.nextLine();
                                lib.addPerson(new Teacher(personId, personName, teacherId, teacherName));
                            }
                            System.out.println("Added Person");
                        }
                        catch (InputMismatchException e) {
                            System.out.println("Invalid input!");
                            sc.nextLine();
                        }
                    }
                    case 4 -> {
                        System.out.println("BookId: ");
                        String bookId = sc.nextLine();
                        System.out.println("PersonId: ");
                        String personId = sc.nextLine();

                        if (lib.borrowBook(personId, bookId))
                            System.out.println("Borrow book successfully");
                        else
                            System.out.println("Borrow book failed");
                    }

                    case 5 -> {
                        System.out.println("BookId: ");
                        String bookId = sc.nextLine();
                        System.out.println("PersonId: ");
                        String personId = sc.nextLine();

                        if (lib.returnBook(personId, bookId))
                            System.out.println("Return book successfully");
                        else
                            System.out.println("Return book failed");
                    }

                    case 6 -> {
                        System.out.println("1. Search by title");
                        System.out.println("2. Search by author");
                        System.out.println("3. Search by id");
                        int choice1 = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Enter Search: ");
                        String search = sc.nextLine();

                        Books resultBook = null;
                        if (choice1 == 1) {
                            resultBook = lib.findBookByTitle(search);
                        } else if (choice1 == 2) {
                            resultBook = lib.findBooksByAuthor(search);
                        } else if (choice1 == 3) {
                            resultBook = lib.findBookById(search);
                        }

                        if (resultBook != null) {
                            resultBook.displayInfor();
                        } else {
                            System.out.println("Book not found");
                        }
                        break;
                    }
                    case 0 -> {
                        System.out.println("Bye!!!");
                        return;
                    }
                    default -> {
                        System.out.println("Invalid choice");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine();
            }
        }

    }
}