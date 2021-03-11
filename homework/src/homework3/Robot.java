package homework3;

public class Robot {
	
		public String  work() {
			System.out.println("Я Robot - я просто працюю");
			return null;
		}

		@Override
		public String toString() {
			return   "+work(), work()+" ;
		}
		
		

}
