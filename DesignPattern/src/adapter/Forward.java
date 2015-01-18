package adapter;

public class Forward extends Player{

	private String name;
	
	public Forward(String name) {
		super(name);
		this.name = name;
	}

	@Override
	public void attack() {
		System.out.println("Foward " + name + " Attack");
	}

	@Override
	public void defense() {
		System.out.println("Foward " + name + " Defense");
	}

}
