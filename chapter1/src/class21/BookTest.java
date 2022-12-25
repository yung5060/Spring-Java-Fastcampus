package class21;

public class BookTest {

    public static void main(String[] args) {
        Book[] library = new Book[5];

//        for (Book book : library) {
//            System.out.println(book);
//        }

        library[0] = new Book("Java", "michael");
        library[1] = new Book("C++", "david");
        library[2] = new Book("Python", "jacob");
        library[3] = new Book("Javascript", "linus");
        library[4] = new Book("Ruby", "reagan");

        for (Book book : library) {
            System.out.println(book);
            book.showInfo();
        }
    }
}
