package main;

public class Enumclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumAnimal animal=EnumAnimal.DOG;
		
		switch(animal) {
		case CAT:
			System.out.println("Cat");
			break;
		case DOG:
			System.out.println("Dog");
			break;
		case MOUSE:
			System.out.println("Mouse");
			break;
		default:
			break;
		
		}
		System.out.println(EnumAnimal.DOG);
		System.out.println("Enum name as a string: "+EnumAnimal.DOG.name());
		System.out.println(EnumAnimal.DOG.getClass());
		System.out.println(EnumAnimal.DOG instanceof Enum);
		System.out.println(EnumAnimal.MOUSE.getName());
	}

}
