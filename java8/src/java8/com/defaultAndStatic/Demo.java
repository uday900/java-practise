package java8.com.defaultAndStatic;

@FunctionalInterface
public interface Demo {
	default void defaultMethod() {
		System.out.println("This is default method");
	}
	
	public void absMethod();
}
