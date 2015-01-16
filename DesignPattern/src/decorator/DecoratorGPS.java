package decorator;

public class DecoratorGPS extends Decorator {
	
	public DecoratorGPS(AbstractCellPhone phone) {
		super(phone);
	}

	public String CallNumber()
	{
	    return this.phone.CallNumber() + " with GPS";
	}
	
	public String SendMessage()
	{
	    return this.phone.SendMessage() + " with GPS";
	}
}
