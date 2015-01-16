package decorator;

public class DecoratorGPS extends Decorator {
	
	AbstractCellPhone phone;

	public DecoratorGPS(AbstractCellPhone phone) {
		this.phone = phone;
	}

	@Override
	public String CallNumber()
	{
	    return this.phone.CallNumber() + " with GPS";
	}
	
	@Override
	public String SendMessage()
	{
	    return this.phone.SendMessage() + " with GPS";
	}
}
