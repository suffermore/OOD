package decorator;

public class IPhone implements AbstractCellPhone {

	public String CallNumber() {
		return "Use Iphone call sombody";
	}

	public String SendMessage() {
		return "Use Iphone send a message to somebody";
	}
}
