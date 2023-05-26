import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Library {

    private static Library instance = new Library();
    
    private static List<Client> clientList = new ArrayList<>();
    private static BookShelf bookShelf = new BookShelf(4);
    
    private Library(){}
   
    public static Library getLibrary(){
        if(null == instance){
            instance = new Library();
            clientList = new ArrayList<>();
            BookShelf bookShelf = new BookShelf(4);
        }
        return instance;
    }
    public void addBook(String Book_name) {
    	bookShelf.appendBook(new Book(Book_name));
    }
    public void get_BookList() {
    	System.out.println("현재 도서관에 있는 책의 갯수 : "+bookShelf.getLength());
    	Iterator it = bookShelf.iterator();
    	while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
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