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
		if(last<books.length) {
			this.books[last] = book;
			last++;	
		}else {
			System.out.println("도서관에 공간이 없습니다.");
		}
	}
	
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
	
	

}
