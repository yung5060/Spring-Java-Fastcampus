package class8;

public class AutoCloseTest {

	public static void main(String[] args) {
		AutoCloseable obj = new AutoClosableObj();

		try (obj) {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("exception");
		}

		System.out.println("end");

	}
}
