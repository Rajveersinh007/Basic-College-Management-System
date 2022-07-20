package college.management.system;

/**
 * this class is for keeping the track of students fees , id , name , grade , fees paid , etc
 * @author Dell
 *
 */
public class Student {
	
	// all the attributes of Student class
	
	private int id; // to protect someone to access student id outside student class
	private String name;
	private int year;
	private String department;
	private int feesPaid;
	private int feesTotal;
	
	// creating the constructor
	/**
	 * fees for every student is 2,00,000 rupees per year
	 * fees paid initially i.e during enrollment=0 
	 * @param id for the student identity
	 * @param name of the student
	 * @param year year of the student
	 * @param department of the student
	 */
	
	public Student(int id, String name, int year , String department) {
		this.id=id;
		this.name=name;
		this.year=year;
		this.department=department;
		
		feesPaid=0;
		feesTotal=200000;
		
	}
	
	// we are not going to change student id , name , department any time in future 
	// creating setter and getter for other attributes
	
	
	/**
	 * Used to update student's year
	 * @param year new year of student
	 */
	public void setYear(int year) {
		this.year=year;
	}
	
	/**
	 * 
	 * Add the fees to feesPaid field
	 * The college is going to receive the money
	 * 
	 * @param fees
	 */
	public void payFeesPaid(int fees) {
		feesPaid += fees;
		College.updateTotalMoneyEarned(feesPaid);
		
		
	}

	// creating getter functions
	
	
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}
	
	public String getDepartment() {
		return department;
	}


	public int getFeesPaid() {
		return feesPaid;
	}


	public int getFeesTotal() {
		return feesTotal;
	}
	
	/**
	 * Return the remaining fees
	 * @return
	 */
	public int getRemainingFees() {
		return feesTotal-feesPaid;
	}
	
	@Override
	public String toString() {
		return "Student name : "+name+"\n"+"Total fees paid so far :"+ feesPaid;
	}

}
