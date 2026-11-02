import java.util.Scanner;

public class PersonnelDirectory {
	public static void main(String[] args) {
		
		Personnel personnel = new Personnel();
		Scanner scan = new Scanner(System.in);
		String firstN, lastN, middleN;
		int empID;
		double salary;
		int choice = -1;

      	do {
			System.out.println("Welcome to the Personnel Directory Management System");
			System.out.println("====================================================");
			System.out.println("\n\n\t 1. Add Personel");
			System.out.println("\n\t 2. Find Personel");
			System.out.println("\n\t 3. Print Names");
			System.out.println("\n\t 4. Number of Entries in the Directory");
			System.out.println("\n\t Select one of the options above (1, 2, 3, 4)");
			choice = scan.nextInt();
			scan.nextLine();

			switch(choice) {
				case 1:
					System.out.println("Enter first name: ");
					firstN = scan.nextLine();
					System.out.println("Enter last name: ");
					lastN = scan.nextLine();
					System.out.println("Enter middle name: ");
					middleN = scan.nextLine();
					System.out.println("Enter empploy id: ");
					empID = scan.nextInt();
					System.out.println("Enter base salaey: " );
					salary = scan.nextDouble();
					scan.nextLine();

					Employee e1 = PersonnelFactory.createPersonnel(Employee.class, lastN, firstN, middleN, empID, salary);
					personnel.addPersonnel(e1);
					break;
				
				case 2:
					System.out.println("Enter firts name: ");
					firstN = scan.nextLine();
					System.out.println("Enter last name: ");
					lastN = scan.nextLine();
					boolean found = false;
					int loc = -1;
					
					for (int i = 0; i < personnel.getSize(); i++) {
						Person person = personnel.getPersonAtIndex(i);
						String firstName = person.getFirstName();
						String lastName = person.getLastName();
						if (firstName.equals(firstN) && lastName.equals(lastN)) {
							found = true;
							loc = i;
							break;
						}
					}
					
					if (found) {
						System.out.println("Found");
						Person foundPerson = personnel.getPersonAtIndex(loc);
						foundPerson.printFirstMiddleLastNames();
					} else {
						System.out.println("Not found");
						Person p1  = PersonnelFactory.createPersonnel(Person.class, lastN, firstN, " ");
						personnel.addPersonnel(p1);
					}
					break;
				
				case 3:
					System.out.println("Enter the order 0: first, middle, last; 1: first, last, middle; 2: last, first, middle");
					int order = scan.nextInt();
					for (int i = 0; i < personnel.getSize(); i++) {
						Person person =personnel.getPersonAtIndex(i);
						if (order == 0) {
							person.printFirstMiddleLastNames();
						} else if (order == 1) {
							person.printFirstLastMiddleNames();
						} else if (order == 2) {
							person.printLastFirstMiddleNames();
						} else {
							System.out.println("Invalid order");
						}
					}
					break;

				case 4:
					System.out.println("Total Entries: " + personnel.getSize());
					break;
			}
		} while(true);
	}
}