package college.management.system;

import java.util.ArrayList;
import java.util.List;

/**
 * The main class
 * @author Dell
 *
 */
public class Main {

	public static void main(String[] args) {
		Teacher Sangeeta = new Teacher(1,"Sangeeta Jadhav",200000);
		Teacher Yuvraj = new Teacher(2,"Yuvraj Gholap",150000);
		Teacher Aparna = new Teacher(3,"Aparana Jhoshi", 120000);
		
		Student Rajveer = new Student(386,"Rajveersinh Gohil",4,"Information Technology");
		Student Rohit = new Student(359,"Rohit Kumar",3,"Computer Science");
		Student Banti = new Student(499,"Banti Kumar",3,"Electronics & Telecommunication");
		Student Harish = new Student(375, "Harish Bajiya",2,"Mechanical Engineering");
		Student Deepak = new Student(360, "Deepak Barnwal",1,"Information Technology");
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(Sangeeta);
		teacherList.add(Yuvraj);
		teacherList.add(Aparna);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(Rajveer);	
		studentList.add(Rohit);
		studentList.add(Banti);
		studentList.add(Harish);
		studentList.add(Deepak);
				
		
		College AIT = new College(teacherList, studentList);
		System.out.println("AIT has earned : " + AIT.getTotalMoneyEarned() + " ₹");
		
		Rajveer.payFeesPaid(50000);		
		Rohit.payFeesPaid(40000);
		Harish.payFeesPaid(100000);
		Rajveer.payFeesPaid(80000);
		
		Teacher Rupali = new Teacher(4, "Rupali Bagate", 100000);
		AIT.addTeacher(Rupali);
		
		System.out.println("AIT has earned : " + AIT.getTotalMoneyEarned() + " ₹");

		System.out.println("Making AIT pay teacher's salary");
		Sangeeta.receiveSalary(Sangeeta.getSalary());
		
		System.out.println("AIT has spent for salary to " + Sangeeta.getName() + " and now has earned " + AIT.getTotalMoneyEarned() + " rupees.");
		
		System.out.println(Rajveer);
		System.out.println(Sangeeta);
	}

}
