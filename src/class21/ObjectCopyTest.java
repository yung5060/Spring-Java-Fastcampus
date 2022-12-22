package class21;

public class ObjectCopyTest {

    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("Java", "michael");
        library[1] = new Book("C++", "david");
        library[2] = new Book("Python", "jacob");
        library[3] = new Book("Javascript", "linus");
        library[4] = new Book("Ruby", "reagan");

        for (int i = 0; i < 5; i++) {
            copyLibrary[i] = new Book();
        }

//        System.arraycopy(library, 0, copyLibrary, 0, 5);

        for (int i = 0; i < 5; i++) {
            copyLibrary[i].setTitle(library[i].getTitle());
            copyLibrary[i].setAuthor(library[i].getAuthor());
        }

        library[0].setAuthor("Yung");
        library[0].setTitle("Go");

        System.out.println("== library ==");
        for (Book book : library) {
            System.out.println(book);
            book.showInfo();
        }

        System.out.println("== copyLibrary ==");
        for (Book book : copyLibrary) {
            System.out.println(book);
            book.showInfo();
        }
    }
}
