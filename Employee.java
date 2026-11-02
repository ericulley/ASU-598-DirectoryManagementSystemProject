public class Employee extends Person {
	
	private int empID;

	public Employee(String last, String first, String middle, int id, double sal) {
		super(last, first, middle);
		empID = id;
	}

	public int getID() {
		return empID;
	}
}
