package decorator;

public class DecoratorBluetooth extends Decorator{

	public DecoratorBluetooth(AbstractCellPhone phone) {
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
