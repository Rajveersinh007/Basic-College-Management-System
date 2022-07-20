package college.management.system;
import java.util.List;

/**
 * College class
 * College can have many teachers and many students
 * Implements Teacher and Student classes
 * @author Dell
 *
 */
public class College {
	
	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	
	/**
	 * Constructor: new college object is created
	 * @param teachers :: list of teachers in college
	 * @param students :: list of students in college
	 */
	public College(List<Teacher> teachers, List<Student> students) {
		super();
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned=0;
		totalMoneySpent=0;
		
		//initially no money is earned or spent when school is created
	}
	
	// as we can alter all the parameters with time hence creating getter and setter for all the fields

	
	/**
	 * 
	 * @return the list of teachers currently in college
	 */
	public List<Teacher> getTeachers() {
		return teachers;
	}

	
	/**
	 * Adds a teacher to school
	 * @param teacher :: the teacher to be added
	 */
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	/**
	 * 
	 * @return the list of students in school
	 */
	public List<Student> getStudents() {
		return students;
	}

	/**
	 * Add a student to the college
	 * @param student :: the student to be added
	 */
	public void addStudent(Student student) {
		students.add(student);
	}

	/**
	 * 
	 * @return the total money earned bu student
	 */
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	/**
	 * Add the total money earned by college
	 * @param moneyEarned :: money that is being added
	 */
	public static void updateTotalMoneyEarned(int moneyEarned) {
		totalMoneyEarned += moneyEarned;
	}

	/**
	 * 
	 * @return the total money spent by college
	 */
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}

	/**
	 * update the money spent by the college
	 * only way to spend money is by salary to teachers
	 * @param MoneySpent :: the money spent
	 */
	public static void updateTotalMoneySpent(int moneySpent) {
		totalMoneyEarned -= moneySpent;
	}
	
	
	
	
	
	
}
