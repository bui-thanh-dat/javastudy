public interface Borrowable {
    boolean borrowBook(Books book);
    boolean returnBook(Books book);
}
