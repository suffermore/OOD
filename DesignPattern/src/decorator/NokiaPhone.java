package decorator;

public class NokiaPhone implements AbstractCellPhone {

	public String CallNumber() {
		return "Use NokiaPhone call sombody";
	}
	
	public String SendMessage() {
		return "Use NokiaPhone send a message to somebody";
	}
}