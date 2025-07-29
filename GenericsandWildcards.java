package main;

import java.util.*;

class Machine3 {

	@Override
	public String toString() {
		return "Iam a Machine";
	}

	public void start() {
		System.out.println("Machine starting.");
	}

}

class Camera3 extends Machine3 {
	public String toString() {
		return "Iam a camera";
	}

	public void snap() {
		System.out.println("Photo taken.");
	}
}

public class GenericsandWildcards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Machine3> list1 = new ArrayList<Machine3>();
		list1.add(new Machine3());
		// list1.add(new Machine3());

		ArrayList<Camera3> list2 = new ArrayList<Camera3>();
		list2.add(new Camera3());
		// list2.add(new Camera3());

		showList(list2);
		showList1(list1);
	}

	public static void showList(ArrayList<? extends Machine3> list) {
		for (Machine3 value : list) {
			System.out.println(value);
			value.start();

		}
	}

	public static void showList1(ArrayList<? super Camera3> list) {
		for (Object value : list) {
			System.out.println(value);

		}
	}
}
