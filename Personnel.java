import java.util.ArrayList;

public class Personnel {

	private ArrayList<Person> personList;

	public Personnel() {
		personList = new ArrayList<Person>();
	}

	public void addPersonnel(Person p) {
		personList.add(p);
	}

	public int getSize() {
		return personList.size();
	}

	public Person getPersonAtIndex(int index) {
		return personList.get(index);
	}
}