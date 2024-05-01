package Lab7b.Q3;

public class ComparableBook implements Comparable<ComparableBook> {
    private int BookID;
    private String BookName;

    public ComparableBook(int id, String name) {
        this.BookID = id;
        this.BookName = name;
    }

    public int getId() {
        return BookID;
    }

    public void setId(int id) {
        this.BookID = id;
    }

    public String getName() {
        return BookName;
    }

    public void setName(String name) {
        this.BookName = name;
    }

    @Override
    public String toString() {
        return "(" + BookID + ", " + BookName + ")";
    }

    @Override
    public int compareTo(ComparableBook otherBook) {
        if (this.getId() < otherBook.getId()) {
            return -1;
        } else if (this.getId() > otherBook.getId()) {
            return 1;
        } else {
            return this.getName().compareTo(otherBook.getName());
        }
    }
}