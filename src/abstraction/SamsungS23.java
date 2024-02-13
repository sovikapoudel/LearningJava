package abstraction;

public class SamsungS23 implements Phone, NetworkProvider {

	@Override
	public void makingCall() {
		System.out.println("This has 6G network");
		
	}

	@Override
	public void sendingText() {
		System.out.println("International text cost some charge");
		
	}

	@Override
	public void internetConnection() {
		System.out.println("This phone has 3 IP addresses for best internet connection");
		
	}

	@Override
	public void takingPicture() {
		System.out.println("It has 4 camera for picture");
		
	}

	@Override
	public void download() {
		System.out.println("You can download up to 100 GB");
		
	
		
	}

	@Override
	public void tmobile() {
		System.out.println("Get free phone with tmobile");
		
	}
	

}
