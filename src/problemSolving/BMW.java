package problemSolving;

public class BMW extends Bike{
	int Wheel =super.wheel; //accessing grandparent attribute
	int parentSeat = super.seat;
	int ChildSeat = this.seat;
	int seat=2;
	@Override
	public void run() {
		System.out.println("This is the grandchild class bike, runs very fast over 100 mpg and has " + Wheel + " wheels");
	}
	
	public void version() {
		System.out.println("This version new and only in grandchild class with seat " +this.seat);
		System.out.println("Previous version had grandparentclass with seat: "+ parentSeat);
	}
	
}
