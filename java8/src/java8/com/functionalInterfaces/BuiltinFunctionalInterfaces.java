package java8.com.functionalInterfaces;

import java.util.function.Function;
import java.util.function.Predicate;

public class BuiltinFunctionalInterfaces {
	
	public static void main(String[] args) {
		
		Function<Integer, Integer> resOfFunction = a -> a *a;
		
		System.out.println(resOfFunction.apply(20));
		
		Predicate<String> resOfPredicate = str -> str.isEmpty();
		
		System.out.println(resOfPredicate.test("  "));
	}
}
