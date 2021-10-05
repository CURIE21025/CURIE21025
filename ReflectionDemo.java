package Saf;

import java.lang.reflect.Constructor;
public class ReflectionDemo {
	public static void main(String[] args)throws Exception {
		//Regarding Object creation
		
		//One way - static way - Student obj=new Student();
		
		//second way - dynamic way
		//Student obj=(Student)Class.forName("com.day10.Student").newInstance();
		//Student obj=(Student)Class.forName("com.day10.Student").getDeclaredConstructor(null).newInstance(args);
		Constructor c= Class.forName("com.day10.Student").getDeclaredConstructor(String.class);
		Student obj=(Student)c.newInstance("ramu");
		System.out.println(obj.getName());
	}
}
class Student{
	public Student() {
		System.out.println("student object created...");
	}
	public Student(String name) {
		System.out.println("student object created....:"+name);
		this.name=name;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	protected int getMarks(String exam) {
		if(exam.equals("test")) {
			return 90;
		}
		else if(exam.equals("annual")) {
			return 100;
		}
		else {
			return 60;
		}
	}
}
