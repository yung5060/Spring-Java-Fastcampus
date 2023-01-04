package class8;

public class AutoClosableObj implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("closing....");
    }
}
