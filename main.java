
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
		
		kyobo.releaseBook("���������� ��ư� �ϴ� �ڵ�");
		aladin.releaseBook("���� ���α׷����� ���� �ǰ� �;�");
		library.get_BookList();
//		
//		library.pushMessage("������ �;�");
//		
//		user2.changeState();
//		
//		library.pushMessage("������ ������?");
//		
//		library.remove(user2);
//		library.pushMessage("�ƴϾ� ������ �;�");


	}

}
