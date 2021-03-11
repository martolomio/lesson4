package homeworkTask2;

public class Main {

	public static void main(String[] args) {
		
		animals an = new animals("Leopard", 20.1, 7);
		
		System.out.println(an);
		an.setAnimal_name("Ox");
		an.setAge(14);
		an.setSpeed(2.2);
		System.out.println(an);
		
	}
}