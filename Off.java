
public class Off implements State{
	
	private static Off off  = new Off();
	
	private Off() {
		
	}
	
	public static Off getInstance() {
		return off;
	}

	@Override
	public void push(User user, String text) {
		System.out.println("�˸��� �����߽��ϴ�.");
	}

	@Override
	public void set_notify(User user) {
		user.setState(On.getInstance());
	}
	
}
