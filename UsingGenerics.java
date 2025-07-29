package main;

import java.util.ArrayList;

public class UsingGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	***BEFORE JAVA 5***	//
		ArrayList list= new ArrayList();
		list.add("apple");
		list.add("Banana");
		list.add("Mango");
		
		String fruit=(String)list.get(1);
		System.out.println(fruit);
		
		//  ***Using Generics***  //
		
		ArrayList<String> Fruit=new ArrayList<String>();
		Fruit.add("Pine Apple");
		Fruit.add("jack fruit");
		String Fruits=Fruit.get(1);
		System.out.println(Fruits);
		
		
		
		
	}

}
