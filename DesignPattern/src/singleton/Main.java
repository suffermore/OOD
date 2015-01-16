package singleton;

/**
 * Client Side
 * @author SufferMore
 */
public class Main {
	
	public static void main(String[] args) {

		Singleton s1 = Singleton.GetInstance();
		Singleton s2 = Singleton.GetInstance();
		
		if (s1 == s2) {
			System.out.println("s1 and s2 are the same instance");
		} else {
			System.out.println("s1 and s2 are different instance");
		}
	}
}
