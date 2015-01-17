package mediator;

abstract class Mediator {
	public abstract void send(String message, Colleague colleague);
}
