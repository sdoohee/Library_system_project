import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		List<Client> clientList = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
//		int input_int;
//		String input_string;
		
		//도서관 객체는 하나만 존재
		Library library1 = Library.getLibrary();
		Library library2 = Library.getLibrary();
		
		Kyobo kyobo = new Kyobo();
		Aladin aladin = new Aladin();
		
		System.out.println(library1 == library2);
		while(true) {
			int input_int;
			String input_string;
			System.out.print("명령을 줄 객체(1.도서관, 2.서점(책 출판), 3.사용자(알림 상태 변경), 4.프로그램 종료) : ");
			input_int = sc.nextInt();
			if(input_int == 1) {
				System.out.print("1.사용자 추가, 2.사용자 삭제, 3.도서 확인 : ");
				input_int = sc.nextInt();
				if(input_int == 1) {
					System.out.print("사용자 이름을 입력하세요 : ");
					input_string = sc.next();
					User temp = new User(input_string);
					clientList.add(temp);
					library1.addClient(temp);
				}else if(input_int == 2) {
					System.out.print("사용자 이름을 입력하세요 : ");
					input_string = sc.next();
					library1.remove(input_string);
				}else if(input_int == 3) {
					library1.get_BookList();
				}else {
					System.out.println("잘못된 입력입니다.");
				}
			}else if(input_int== 2) {
				System.out.print("출판사를 선택하세요(1.교보문고, 2.알라딘) : ");
				input_int = sc.nextInt();
				if(input_int == 1) {
					System.out.print("책 이름을 입력하세요 : ");
					input_string = sc.next();
					kyobo.releaseBook(input_string);
				}else if(input_int == 2) {
					System.out.print("책 이름을 입력하세요 : ");
					input_string = sc.next();
					aladin.releaseBook(input_string);
				}else {
					System.out.println("잘못된 입력입니다.");
				}
			}else if(input_int == 3) {
				System.out.print("사용자의 이름을 입력하세요. : ");
				input_string = sc.next();
				for(Client cl: clientList) {
		    		if(cl.getName().equals(input_string)) {
		    			cl.changeState();
		    		}	
		    	}
			}else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
		}
		
		
//		//도서관 객체는 하나만 존재
//
//		
//		//도서관에 사용자 등록
//		User user1 = new User("송지현");
//		User user2 = new User("송복치");
//		
//		library1.addClient(user1);
//		library2.addClient(user2);
//		
//
//		//교보에서 책 출시
//		kyobo.releaseBook("유지보수를 어렵게 하는 코딩");
//		
//		//사용자2가 알림을 차단함
//		user2.changeState();
//		
//		//교보에서 책 출시
//		kyobo.releaseBook("돈을 받고 일을 안하는 방법");
//		
//		//사용자2를 유저 목록에서 삭제
//		library1.remove(user2);
//		
//		//교보에서 책 출시
//		kyobo.releaseBook("중국의 C언어와 프로그래밍 C언어의 차이점");
//		
//		//알라딘에서 책 출시
//		aladin.releaseBook("나도 프로그래밍의 신이 되고 싶어");
//		
//		//알라딘에서 책 출시
//		aladin.releaseBook("개복치를 오래 살게 하는 방법");
//				
//		//도서관에 배치된 책의 갯수와 이름 반환
//		library1.get_BookList();
	}

}
