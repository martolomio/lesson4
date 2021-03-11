package homework3;

public class CoffeeRobot extends Robot {

	public String work() {
		System.out.println("Я CoffeeRobot - я варю каву");
		return null;
	}

	@Override
	public String toString() {
		return "+work(), work()+";
	}
	
	
}
