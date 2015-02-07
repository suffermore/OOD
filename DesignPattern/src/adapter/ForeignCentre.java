package adapter;

public class ForeignCentre {

	private String name;
	
	public String get() {
		return this.name;
	}

	public void set(String name) {
		this.name = name;
	}
	
	public void attack() {
		System.out.println("Foriegn Centre " + name + " Attack");
	}

	public void defense() {
		System.out.println("Foriegn Centre " + name + " Defense");
	}
}
