
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library library = Library.getLibrary();
		Library library2 = Library.getLibrary();
	
		System.out.println(library==library2);
		
		Kyobo kyobo = new Kyobo();
		Aladin aladin = new Aladin();
//		
//		
		User user1 = new User();
		User user2 = new User();
//		
//		
		library.addClient(user1);
		library.addClient(user2);
		
		kyobo.releaseBook("유지보수를 어렵게 하는 코딩");
		aladin.releaseBook("나도 프로그래밍의 신이 되고 싶어");
		library.get_BookList();
//		
//		library.pushMessage("집가고 싶어");
//		
//		user2.changeState();
//		
//		library.pushMessage("집가기 싫은데?");
//		
//		library.remove(user2);
//		library.pushMessage("아니야 집가고 싶어");


	}

}
