package decorator;

public abstract class Decorator extends AbstractCellPhone {
	
	AbstractCellPhone phone;

	public Decorator(AbstractCellPhone phone) {
		this.phone = phone;
	}
	
	@Override
	public String CallNumber() {
		return this.phone.CallNumber();
	}

	@Override
	public String SendMessage() {
		return this.phone.SendMessage();
	}
}
