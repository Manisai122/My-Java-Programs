package main;
class Frog{
	private int id;
	private String name;
	
	public Frog(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
	
		return String.format("%2d : %s", id,name);
		
	
		/*StringBuilder sb=new StringBuilder();
		sb.append(id).append(":").append(name);
		return sb.toString();*/
	}
	
}
public class ToString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frog frog1=new Frog(7,"freddy");
		Frog frog2=new Frog(8,"fruity");
		System.out.println(frog1);
		System.out.println(frog2);
	}

}
