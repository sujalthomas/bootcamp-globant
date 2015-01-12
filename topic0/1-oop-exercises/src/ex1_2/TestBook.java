package ex1_2;

public class TestBook {

	public static void main(String[] args) {
		Author anAuthor = new Author("Juan", "juan@mail.com", 'm');
		Book aBook = new Book("Java for dummy", anAuthor, 19.95, 1000);
		// Use an anonymous instance of Author
		Book anotherBook = new Book("more Java for dummy", new Author("Juan II", "juan2@mail.com", 'm'), 29.95, 888);

		System.out.println(aBook);
		System.out.println(anotherBook);

		// 1)
		System.out.println("Author's name: " + aBook.getAuthorName());
		System.out.println("Author's email: " + aBook.getAuthorEmail());
	}
}
