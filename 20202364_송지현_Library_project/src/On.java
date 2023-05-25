public class On implements State{
	
	private static On on  = new On();
	
	private On() {
		
	}
	
	public static On getInstance() {
		return on;
	}

	@Override
	public void push(User user, String text) {
		System.out.println(text);
	}

	@Override
	public void set_notify(User user) {
		user.setState(Off.getInstance());
	}
	
}
