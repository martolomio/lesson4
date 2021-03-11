package homeworkTask2;

public class animals {

	private String name;
	private double speed;
	private int age;
	
	public animals(String name,double speed, int age ){
		super();
		this.name = name;
		this.speed = speed;
		this.age = age;
	}
	
	public String getAnimal_name() {
		return name;
	}
	public void setAnimal_name(String name) {
		this.name =name;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "animals [name=" + name + ", speed=" + speed + ", age=" + age + "]";
	}
	
	
	
	
	
	
}
