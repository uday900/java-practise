package java8.com.methodReference;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class DemoDriver {
	
	DemoDriver(){
		System.out.println("default contructor");
	}
	 public static boolean isPalindrome(String str) {
	        StringBuilder sb = new StringBuilder(str);
	        return sb.reverse().toString().equals(str);
	    }
	
	
	public static void main(String[] args) {
		
		Predicate<String> ispalindrome = DemoDriver::isPalindrome;
		
		Runnable constructor = DemoDriver::new;
		
		constructor.run();
		
		System.out.println(ispalindrome.test("abasdf"));
		
	}
}
