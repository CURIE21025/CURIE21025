package Saf;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class Testreflect {
	public static void main(String[] args)throws Exception {
		PoliceStation p1=new PoliceStation();
		
		Politician holyman=new Politician();
		FreedomFighter fighter=new FreedomFighter();
		
		p1.arrest(holyman);
	}
}
class PoliceStation{
	public void arrest(Object o) throws Exception{
		//Reflection in java is used for interrogation of the object
		Class c=o.getClass();
		Field f= c.getField("name");
		System.out.println(f.get(o));
		
		Method met=c.getMethod("service");
		met.invoke(o);
		//the interrogation methods will change.....
		
		f=c.getDeclaredField("secretName");
		f.setAccessible(true);
		System.out.println(f.get(o));
		met=c.getDeclaredMethod("secretService");
		met.setAccessible(true);
		met.invoke(o);
	}
}
class FreedomFighter{
	public String name="freedom fighter";
	private String secretName="some agenda....";
	public void service() {
		System.out.println("freedom service....");
	}
	private void secretService() {
		System.out.println("freedom fighter secret service...................");
	}
}
class Politician{
	private String secretName="unknown....";
	public String name="I am a holy man...selfless..for the people...";
	
	public void service() {
		System.out.println("I do social service....");
	}
	
	private void secretService() {
		System.out.println("only God knows...................");
}
