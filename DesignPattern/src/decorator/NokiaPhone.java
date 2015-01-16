package decorator;

public class NokiaPhone implements AbstractCellPhone {

	public String CallNumber() {
		return "NokiaPhone call sombody";
	}
	
	public String SendMessage() {
		return "NokiaPhone send a message to somebody";
	}
}