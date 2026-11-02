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

	public void printName(int order) {
		if (order == 0) {
	    	System.out.println(first + "  " + middle + "  " + last);
		} else if (order == 1) {
	    	System.out.println(first + " ," + last+ " " + middle);
	    } else if(order == 2) {
			System.out.println(last + " ," + first + " " + middle);
	    }
	}
}