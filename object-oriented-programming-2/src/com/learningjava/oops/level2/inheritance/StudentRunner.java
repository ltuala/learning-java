package com.learningjava.oops.level2.inheritance;

public class StudentRunner {
	public static void main(String[] args) {
//		Student student = new Student();
//		student.setName("Leo");
//		student.setEmail("leo@gmail.com");

//		Person person = new Person();
//		person.setName("Leo");
//		person.setEmail("leo@gmail.com");
//		person.setPhoneNumber("977715324");
//		String value = person.toString();
//		System.out.println(value);
//		System.out.println(person.toString());

		Employee employee = new Employee();
		employee.setName("Leo");
		employee.setEmail("leo@gmail.com");
		employee.setPhoneNumber("977715324");
		employee.setEmployeeGrade('A');
		employee.setTitle("Programmer Analyst");

		System.out.println(employee);
	}
}
