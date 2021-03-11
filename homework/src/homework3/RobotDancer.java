package homework3;

public class RobotDancer extends Robot {
	
	public String  work() {
		System.out.println("Я RobotDancer - я просто танцюю");
		return null;
	}

	@Override
	public String toString() {
		return "+work(), work()+";
	}

}
