package JavaTask6;

public class Employee {

	private int id;
	private String name;
	private int salary;

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void raiseSalary(double percent) {
		if (percent < 0) {
			throw new IllegalArgumentException("Percent must be non-negative");
		}
		salary += salary * (percent / 100);
	}

	@Override
	public String toString() {
		return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + '}';
	}

	public static void main(String[] args) {
		Employee emp = new Employee(1, "John Doe", 50000);
		System.out.println(emp);

		emp.raiseSalary(10);
		System.out.println("After raise: " + emp);
	}

}
