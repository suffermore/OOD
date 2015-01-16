package decorator;

public class IPhone implements AbstractCellPhone {

	public String CallNumber() {
		return "Iphone call sombody";
	}

	public String SendMessage() {
		return "Iphone send a message to somebody";
	}
}
