package Saf;

import java.util.Scanner;
public class ReflectionDemo2 {
	public static void main(String[] args)throws Exception {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter class name..:");
		String name=scan.next();
		
		String empclass=name;
		
		//Employee emp=new Engineer();
		Employee emp=(Employee)Class.forName(empclass).getDeclaredConstructor(null).newInstance(null);
		System.out.println(emp);
	}
}
class Employee{
	
}
class Engineer extends Employee{
	
}
class Attendar extends Employee{
	
}

}
