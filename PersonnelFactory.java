public class PersonnelFactory {

    public static <T> T createPersonnel(Class<T> type, String last, String first, String middle) {
        return createPersonnel(type, last, first, middle, 0, 0.0);
    }

    public static <T> T createPersonnel(Class<T> type, String last, String first, String middle, int empID, double salary) {
        switch (type.getSimpleName()) {
            case "Person":
                return type.cast(new Person(last, first, middle));
            case "Employee":
                return type.cast(new Employee(last, first, middle, empID, salary));
            default:
                System.out.println("Invalid personnel type: " + type.getSimpleName());
                return null;
        }
    }
}
