public interface Client {
	
	String getName();
	void setState(State state);
	
	void update(String text);
	
	void changeState();

}
