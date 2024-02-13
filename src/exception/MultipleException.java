package exception;

public class MultipleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int arr[]= {1, 2,3, 4};
			arr[8]=arr[3/0];
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) 
		{
			
			System.out.println("Expecption occured: "+ e.getMessage());
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}

	}

}
