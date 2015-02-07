package adapter;

public class ForeignCentre {

	private String name;
	
	public String get() {
		return this.name;
	}

	public void set(String name) {
		this.name = name;
	}
	
	public void foreignAttack() {
		System.out.println("Foriegn Centre " + name + " Attack");
	}

	public void foreignDefense() {
		System.out.println("Foriegn Centre " + name + " Defense");
	}
}
