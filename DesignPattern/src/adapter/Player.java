package adapter;

public abstract class Player {
	
	private String name;
	
	public Player(String name) {
		this.name = name;
	}
	
	public abstract void attack();
	
	public abstract void defense();
	
	public void pauseEmergency() {
		System.out.println("Emergent Pause");
	}
	
}
