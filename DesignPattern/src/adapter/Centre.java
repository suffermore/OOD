package adapter;

public class Centre extends Player {

	private String name;
	
	public Centre(String name) {
		super(name);
		this.name = name;
	}

	@Override
	public void attack() {
		System.out.println("Centre " + name + " Attack");
	}

	@Override
	public void defense() {
		System.out.println("Centre " + name + " Defense");
	}

}
