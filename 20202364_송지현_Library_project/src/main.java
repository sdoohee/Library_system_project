import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		List<Client> clientList = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
//		int input_int;
//		String input_string;
		
		//������ ��ü�� �ϳ��� ����
		Library library1 = Library.getLibrary();
		Library library2 = Library.getLibrary();
		
		Kyobo kyobo = new Kyobo();
		Aladin aladin = new Aladin();
		
		System.out.println(library1 == library2);
		while(true) {
			int input_int;
			String input_string;
			System.out.print("����� �� ��ü(1.������, 2.����(å ����), 3.�����(�˸� ���� ����), 4.���α׷� ����) : ");
			input_int = sc.nextInt();
			if(input_int == 1) {
				System.out.print("1.����� �߰�, 2.����� ����, 3.���� Ȯ�� : ");
				input_int = sc.nextInt();
				if(input_int == 1) {
					System.out.print("����� �̸��� �Է��ϼ��� : ");
					input_string = sc.next();
					User temp = new User(input_string);
					clientList.add(temp);
					library1.addClient(temp);
				}else if(input_int == 2) {
					System.out.print("����� �̸��� �Է��ϼ��� : ");
					input_string = sc.next();
					library1.remove(input_string);
				}else if(input_int == 3) {
					library1.get_BookList();
				}else {
					System.out.println("�߸��� �Է��Դϴ�.");
				}
			}else if(input_int== 2) {
				System.out.print("���ǻ縦 �����ϼ���(1.��������, 2.�˶��) : ");
				input_int = sc.nextInt();
				if(input_int == 1) {
					System.out.print("å �̸��� �Է��ϼ��� : ");
					input_string = sc.next();
					kyobo.releaseBook(input_string);
				}else if(input_int == 2) {
					System.out.print("å �̸��� �Է��ϼ��� : ");
					input_string = sc.next();
					aladin.releaseBook(input_string);
				}else {
					System.out.println("�߸��� �Է��Դϴ�.");
				}
			}else if(input_int == 3) {
				System.out.print("������� �̸��� �Է��ϼ���. : ");
				input_string = sc.next();
				for(Client cl: clientList) {
		    		if(cl.getName().equals(input_string)) {
		    			cl.changeState();
		    		}	
		    	}
			}else {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
		}
		
		
//		//������ ��ü�� �ϳ��� ����
//
//		
//		//�������� ����� ���
//		User user1 = new User("������");
//		User user2 = new User("�ۺ�ġ");
//		
//		library1.addClient(user1);
//		library2.addClient(user2);
//		
//
//		//�������� å ���
//		kyobo.releaseBook("���������� ��ư� �ϴ� �ڵ�");
//		
//		//�����2�� �˸��� ������
//		user2.changeState();
//		
//		//�������� å ���
//		kyobo.releaseBook("���� �ް� ���� ���ϴ� ���");
//		
//		//�����2�� ���� ��Ͽ��� ����
//		library1.remove(user2);
//		
//		//�������� å ���
//		kyobo.releaseBook("�߱��� C���� ���α׷��� C����� ������");
//		
//		//�˶�򿡼� å ���
//		aladin.releaseBook("���� ���α׷����� ���� �ǰ� �;�");
//		
//		//�˶�򿡼� å ���
//		aladin.releaseBook("����ġ�� ���� ��� �ϴ� ���");
//				
//		//�������� ��ġ�� å�� ������ �̸� ��ȯ
//		library1.get_BookList();
	}

}
