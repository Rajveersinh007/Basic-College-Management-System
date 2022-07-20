package college.management.system;

/**
 * This class is responsible for keeping track of teachers name,id, salary
 * @author Dell
 *
 */
public class Teacher {
	
	//attributes
	
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	/**
	 * Constructor for new teacher object
	 * @param id id of teacher
	 * @param name of teacher
	 * @param salary of teacher
	 */
	public Teacher(int id, String name, int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.salaryEarned=0;
	}
	
	/**
	 * Creating getters
	 * @return  id of teacher
	 */
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
		
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	// id , name are constant hence no setter for them
	
	/**
	 * set the salary
	 * @param salary
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	/**
	 * Adds to the salaryEarned
	 * Removes from the total money earned by college
	 * @param salary
	 */
	public void receiveSalary(int salary) {
		salaryEarned += salary;
		College.updateTotalMoneySpent(salary);
	}
	
	@Override
	public String toString() {
		return "Name of faculty : "+ name + "\n"+"Total salary earned so far :"+salaryEarned;
	}
	
	 
}
