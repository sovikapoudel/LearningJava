package abstraction;

public class PhoneMain {
	public static void main(String[] args) {
		Phone ph = new Iphone();
		ph.internetConnection();
		ph.download();
		ph.makingCall();
		System.out.println("Samsung Ref object");
		System.out.println();
		
		SamsungS23 sg = new SamsungS23();
		sg.internetConnection();
		sg.download();
		sg.makingCall();
		
		
	}

}
