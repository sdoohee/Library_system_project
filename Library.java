import java.util.ArrayList;
import java.util.List;

public class Library {

    private static Library instance = new Library();
    
    private static List<Client> clientList = new ArrayList<>();
    private static List<String> bookList = new ArrayList<>();

    //생성자의 접근제어자를 private로
    private Library(){}
   

    //외부에서 접근 가능한 static 메서드 생성
    public static Library getLibrary(){
    	//객체가 있는지 없는지 판별
        if(null == instance){
            instance = new Library();
            clientList = new ArrayList<>();
            bookList = new ArrayList<>();
        }
        return instance;
    }
    public void addBook(String Book_name) {
    	bookList.add(Book_name);
    }
    public void get_BookList() {
    	System.out.println(bookList);
    }
    
    
    public void pushMessage(String text) {
    	notifyClient(text);
    }
    
    public void addClient(Client client) {
    	clientList.add(client);
    }
    
    public void remove(Client client) {
    	clientList.remove(client);
    }
    
    public void notifyClient(String text) {
    	for(Client cl: clientList) {
    		cl.update(text);
    	}
    }
}