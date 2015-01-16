package decorator;

public class Client {
	public static void main(String args[]) {
		
		AbstractCellPhone phone = new NokiaPhone();
		System.out.println(phone.CallNumber());
		System.out.println(phone.SendMessage());
		
		DecoratorGPS gps = new DecoratorGPS(phone);
		System.out.println(gps.CallNumber());
		System.out.println(gps.SendMessage());
		
		DecoratorBluetooth bluetooth = new DecoratorBluetooth(phone);
		System.out.println(bluetooth.CallNumber());
		System.out.println(bluetooth.SendMessage());
	}
}
