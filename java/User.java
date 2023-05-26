public class User implements Client {
	
	private State state;
	public User() {
		state=On.getInstance();
	}
	
	@Override
	public void update(String text) {
		state.push(this, text);
	}

	@Override
	public void setState(State state) {		
		this.state=state;
	}
	
	@Override
	public void changeState() {
		state.set_notify(this);
	}

}
