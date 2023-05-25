public class User implements Client {
	
	private State state;
	private String name;
	public User(String name) {
		this.state=On.getInstance();
		this.name = name;
	}
	@Override
	public String getName() {
		return this.name;
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
