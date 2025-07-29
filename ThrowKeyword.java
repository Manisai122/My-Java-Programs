package main;

class Math {
	public void div(int x,int y) {
		int z=0;
		try {
			//identifying the exception
			if(y==0) {
				//creation of exception object
				ArithmeticException ae=new ArithmeticException("divide bye zero.divisor cant be zero");
				//throwing exception
				throw ae;
			}
			z=x/y;
			System.out.println("Division: "+z);
		}
		catch(ArithmeticException e) {
			System.out.println("Error in div():"+e);
		}
		System.out.println("div() terminating...");
	}
}

public class ThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math ob=new Math();
		ob.div(12, 3);
		ob.div(15,0);
		ob.div(20,4);
		

	}

}
