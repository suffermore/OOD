package decorator;

public class IPhone extends AbstractCellPhone {

	@Override
	public String CallNumber() {
		return "Iphone call sombody";
	}

	@Override
	public String SendMessage() {
		return "Iphone send a message to somebody";
	}
}
