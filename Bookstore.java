
public abstract class Bookstore {
	
	Library library = Library.getLibrary();
	
	public void releaseBook(String book_name) {
		arrangementBook(book_name);
		notifyBook(book_name);
	}
	
	private void arrangementBook(String book_name) {
//		System.out.println("책을 배치하였습니다.");
		library.addBook(book_name);
	}
	public abstract void notifyBook(String book_name);

}
