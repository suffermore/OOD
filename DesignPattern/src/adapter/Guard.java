package adapter;

public class Guard extends Player {

	private String name;
	
	public Guard(String name) {
		super(name);
		this.name = name;
	}

	@Override
	public void attack() {
		System.out.println("Guard " + name + " Attack");
	}

	@Override
	public void defense() {
		System.out.println("Guard " + name + " Defense");
	}
}
