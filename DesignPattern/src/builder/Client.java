package builder;
/**
 * Assume client want to produce a kind of product which is compased by two parts. 
 * We can use builder pattern to implement this requirement.
 * */
public class Client {
	
	public static void main(String[] args) {
		Director director = new Director();
		Builder b1 = new ConcreteBuilderA();
		Builder b2 = new ConcreteBuilderB();
		
		director.construct(b1);
		Product p1 = b1.getResult();
		p1.show();
		
		director.construct(b2);
		Product p2 = b2.getResult();
		p2.show();
	}
}
