package mediator;

public class ConcreteMediator extends Mediator {

	private ConcrereColleagueA colleagueA;
	private ConcreteColleagueB colleagueB;
	
	public void setColleagueA(ConcrereColleagueA value) {
		this.colleagueA = value;
	}
	public void setColleagueB(ConcreteColleagueB value) {
		this.colleagueB = value;
	}
	
	@Override
	public void send(String message, Colleague colleague) {
		if (colleague  == colleagueA) {
			colleagueB.notidy(message);
		} else {
			colleagueA.notidy(message);
		}
	}

}
