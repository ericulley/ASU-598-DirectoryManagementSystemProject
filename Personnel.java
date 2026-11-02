import java.util.*;

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

	public void printAllNames(int order) {
		for (int i = 0; i < personList.size(); i++) {
			personList.get(i).printName(order);
		}
	}
}