public class main {

	public static void main(String[] args) {
		Library library = Library.getLibrary();
		
		Kyobo kyobo = new Kyobo();
		
		Aladin aladin = new Aladin();

		User user1 = new User();
		User user2 = new User();

		library.addClient(user1);
		library.addClient(user2);
		
		kyobo.releaseBook("유지보수를 어렵게 하는 코딩");
		aladin.releaseBook("나도 프로그래밍의 신이 되고 싶어");
		library.get_BookList();

	}

}
