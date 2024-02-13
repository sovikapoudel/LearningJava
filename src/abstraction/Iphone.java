package abstraction;

public class Iphone implements Phone{

	@Override
	public void makingCall() {
		System.out.println("It can make a call with 5G network");
		
	}

	@Override
	public void sendingText() {
		System.out.println("Internationaltext is free with this phone");
		
	}

	@Override
	public void internetConnection() {
		System.out.println("This phone has 2 IP address for best internet connection");
		
	}

	@Override
	public void takingPicture() {
		System.out.println("It has 3 camera for picture");
		
	}

	@Override
	public void download() {
		System.out.println("You can download up to 50 GB");
		
	}

}
