package decorator;

public class NokiaPhone extends AbstractCellPhone {

	@Override
	public String CallNumber() {
		return "NokiaPhone call sombody";
	}
	
	@Override
	public String SendMessage() {
		return "NokiaPhone send a message to somebody";
	}
}