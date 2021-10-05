package Saf;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class Reflection {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
policestation p1=new policestation();
politician holyman =new politician();
freedomfighter fighter =new freedomfighter();
p1.arrest(holyman);
	}
static class politician{
	public String name="i am selfless";
	private String secname="unknown";
	public void service() {
		System.out.println("social service");
	}
	private void secsevice() {
		System.out.println("myown");
	}
}
}
class freedomfighter{
	
		public String name="i fight";
		private String secname="i runaway";
		public void service() {
			System.out.println("national service");
		}
		private void secsevice() {
			System.out.println("self service");
		}
	}
class policestation{
	public void arrest(Object o)throws Exception{
		Class c=o.getClass();
		Field f=c.getField("name");
		System.out.println(f.get(o));
		
		Method met=c.getMethod("service");
		met.invoke(o);
		
		
		Field f1=c.getDeclaredField("secname");
		f.setAccessible(true);
		System.out.println(f.get(o));
		
		Method met1=c.getDeclaredMethod("secservice");
		met.setAccessible(true);
		met.invoke(o);
		
	}
	
}
