package main;

class Casio{
	public void add(int i,int j) {
		System.out.println(i+j);
	}
	public void add(int i,int j,int k) {
		System.out.println(i+j+k);
	}
	public void add(double i,double j) {
		System.out.println(i+j);
	}


}
public class MethodOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Casio obj=new Casio();
		obj.add(5, 2);
		obj.add(2, 3,4);
		obj.add(2.2,3.3 );
	}

}
