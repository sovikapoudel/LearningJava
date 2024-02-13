package overriding;

public class SmartPhone extends Phone {

public void camera() {
	System.out.println("This camera is 15 megapixel");
}
public void storage() {
	System.out.println("This phone has 1 TB storage");
}
@Override
public void ram() {
	System.out.println("This is Child class phone: 8 GB RAM");
}
public void display() {
	
	this.ram();
	super.ram();
}

}
