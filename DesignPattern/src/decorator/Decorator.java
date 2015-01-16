package decorator;

public class Decorator implements AbstractCellPhone {
	
	AbstractCellPhone phone;

	public Decorator(AbstractCellPhone phone) {
		this.phone = phone;
	}
	
	public String CallNumber() {
		return this.phone.CallNumber();
	}

	public String SendMessage() {
		return this.phone.SendMessage();
	}
}
