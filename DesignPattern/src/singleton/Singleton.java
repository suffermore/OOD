package singleton;

public class Singleton {
	
	private static Singleton instance;
	
	private Singleton() {
		
	}
	
	public static Singleton GetInstance() {
		return instance;
	}
}
