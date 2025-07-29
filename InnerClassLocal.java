package main;

public class InnerClassLocal {
	void outerMethod() {
		int num=22;
		
		//Local inner class inside method
		class LocalInner{
			void display() {
				System.out.println("Number is:"+num);
			}
		}
		//create obj and call method
		LocalInner local=new LocalInner();
		local.display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClassLocal outer=new InnerClassLocal();
		outer.outerMethod();
	}

}
