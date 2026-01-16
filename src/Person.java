public abstract class Person implements Borrowable {
    protected String id;
    protected String name;


    public String getId() {
        return id;
    }

    public abstract void displayInfor();
}
