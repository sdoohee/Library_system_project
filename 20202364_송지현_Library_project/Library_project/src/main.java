public class main {

	public static void main(String[] args) {
		Library library = Library.getLibrary();
		
		Kyobo kyobo = new Kyobo();
		
		Aladin aladin = new Aladin();

		User user1 = new User();
		User user2 = new User();

		library.addClient(user1);
		library.addClient(user2);
		
		kyobo.releaseBook("���������� ��ư� �ϴ� �ڵ�");
		aladin.releaseBook("���� ���α׷����� ���� �ǰ� �;�");
		library.get_BookList();

	}

}
