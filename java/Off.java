public class Off implements State{
	
	private static Off off  = new Off();
	
	private Off() {
		
	}
	
	public static Off getInstance() {
		return off;
	}

	@Override
	public void push(User user, String text) {
		System.out.println("알림을 차단했습니다.");
	}

	@Override
	public void set_notify(User user) {
		user.setState(On.getInstance());
	}
	
}
