
public class Employee {
	public String firstName, lastName;
	private Double salary;
	public String position;

	public Employee(String firstnameInput, String lastnameInput, double salaryInput, String positionInput) {
		firstName = firstnameInput;
		lastName = lastnameInput;
		salary = salaryInput;
		position = positionInput;
	}

	public static void main(String[] agrs) {
		Employee employee = new Employee("Thummanoon", "Hwanchaeam", 15000, "Manager");
		Employee employee2 = new Employee("Kunanon", "Somkum", 20000, "Manager");
		employee.checkPosition();
		employee2.checkFullname();
	}

	public void hello() {
		System.out.println("Hello " + firstName);
	}

	public double getSalary() {
		return salary;
	}

	public void checkPosition() {
		System.out.println("My position is" + position);
	}

	public void checkFullname() {
		System.out.println("Name:" + firstName + " " + lastName);
	}
}
