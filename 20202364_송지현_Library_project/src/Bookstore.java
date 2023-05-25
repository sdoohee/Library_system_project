public abstract class Bookstore {
	
	Library library = Library.getLibrary();
	
	public void releaseBook(String book_name) {
		arrangementBook(book_name);
		notifyBook(book_name);
	}
	
	private void arrangementBook(String book_name) {
		library.addBook(book_name);
	}
	public abstract void notifyBook(String book_name);

}
