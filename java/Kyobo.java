public class Kyobo extends Bookstore {
	public void notifyBook(String book_name) {
		library.pushMessage(book_name + "��(��) ����߽��ϴ�.");
	}
}