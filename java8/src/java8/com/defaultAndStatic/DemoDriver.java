package java8.com.defaultAndStatic;

public class DemoDriver implements Demo{
	public static void main(String[] args) {
		
		Demo demo = () -> System.out.println("abs method");
		demo.defaultMethod();
		demo.absMethod();
		
		DemoDriver ob = new DemoDriver();
		ob.defaultMethod();
		ob.absMethod();
		
		
	}

	@Override
	public void absMethod() {
		// TODO Auto-generated method stub
		
	}
	
	public void defaultMethod() {
		System.out.println("override");
	}

}
