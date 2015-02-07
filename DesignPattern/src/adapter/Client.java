package adapter;

public class Client {
	
	public static void main(String[] args) {
		
		Player a = new Forward("Nene");
		Player b = new Guard("Bill");
		Player c = new Centre("Pierse");
		Player d = new Translater("Gotate");
		
		a.attack();
		b.attack();
		c.defense();
		d.defense();
	}
}
