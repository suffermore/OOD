package mediator;

public class Client {

	public static void main(String[] args) {
		ConcreteMediator m = new ConcreteMediator();
		
		ConcrereColleagueA c1 = new ConcrereColleagueA(m);
		ConcreteColleagueB c2 = new ConcreteColleagueB(m);
		
		m.setColleagueA(c1);
		m.setColleagueB(c2);
		
		c1.send("Did you have dinner?");
		c2.send("No.");
	}
}
