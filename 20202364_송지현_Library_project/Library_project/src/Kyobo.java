public class Kyobo extends Bookstore {
	public void notifyBook(String book_name) {
		library.pushMessage(book_name + "이(가) 출시했습니다.");
	}
}