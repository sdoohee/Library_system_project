import java.util.Iterator;

public class BookShelf implements Aggregate {
	private Book[] books;
	private int last = 0;
	
	public BookShelf(int maxSize) {
		this.books = new Book[maxSize];
	}
	
	public Book getBookAt(int index) {
		return books[index];
	}
	
	public int getLength() {
		return last;
	}
	
	public void appendBook(Book book) {
		this.books[last] = book;
		last++;
	}
	
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
	
	

}
