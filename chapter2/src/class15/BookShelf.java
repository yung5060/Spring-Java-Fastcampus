package class15;

public class BookShelf extends Shelf implements Queue {

    @Override
    public void enQueue(String title) {
        this.shelf.add(title);
    }

    @Override
    public String deQueue() {
        return shelf.remove(0);
    }

    @Override
    public int getSize() {
        return this.getCount();
    }
}
