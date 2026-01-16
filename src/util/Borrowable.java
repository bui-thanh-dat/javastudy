package util;

import model.Books;

public interface Borrowable {
    boolean borrowBook(Books book);
    boolean returnBook(Books book);
}
