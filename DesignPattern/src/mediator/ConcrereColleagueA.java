package mediator;

public class ConcrereColleagueA extends Colleague{

	public ConcrereColleagueA(Mediator mediator) {
		super(mediator);
	}
	
	public void send(String message) {
		mediator.send(message, this);
	}
	
	public void notidy(String message) {
		System.out.println("Colleague A get the message.");
	}

}
