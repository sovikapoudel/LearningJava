package problemSolving;

public class Bikemain {
	int wheel = 4;
	int seat = 3;

	public void run() {
		System.out.println("By default it must run atleast 50 mpg");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW bmw = new BMW();
		System.out.println(bmw.wheel); // getting from Bikemain ->bike->BMW
		bmw.run();
		System.out.println(bmw.seat); //grandchild seat
		bmw.version();

	}

}
