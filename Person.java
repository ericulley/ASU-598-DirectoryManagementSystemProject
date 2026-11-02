public class Person {
	
	private String last;
	private String first;
	private String middle;

	public Person(String last, String first, String middle) {
		this.last = last;
		this.first = first;
		this.middle = middle;
	}

	public String getFirstName() {
		return first;
	}

	public String getLastName() {
		return last;
	}

	public void printFirstMiddleLastNames() {
		System.out.println(this.first + "  " + this.middle + "  " + this.last);
	}

	public void printFirstLastMiddleNames() {
		System.out.println(this.first + "  " + this.last + " " + this.middle);
	}

	public void printLastFirstMiddleNames() {
		System.out.println(this.last + " " + this.first + "  " + this.middle);
	}
}