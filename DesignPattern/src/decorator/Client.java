package decorator;

public class Client {
	public static void main(String args[]) {
		
		//component A: Nokia
		AbstractCellPhone phone = new NokiaPhone();
		System.out.println(phone.CallNumber());
		System.out.println(phone.SendMessage());
		
		DecoratorGPS gpsNokia = new DecoratorGPS(phone);
		System.out.println(gpsNokia.CallNumber());
		System.out.println(gpsNokia.SendMessage());
		
		DecoratorBluetooth bluetoothNokia = new DecoratorBluetooth(phone);
		System.out.println(bluetoothNokia.CallNumber());
		System.out.println(bluetoothNokia.SendMessage());
		
		//component B: iphone
		AbstractCellPhone iphone = new IPhone();
		DecoratorGPS gpsIphone = new DecoratorGPS(iphone);
		System.out.println("\n" + gpsIphone.CallNumber());
		
		DecoratorBluetooth bluetoothIphone = new DecoratorBluetooth(phone);
		System.out.println(bluetoothIphone.SendMessage());
	}
}
