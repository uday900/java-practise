package java8.com.Optional;

import java.util.Optional;

public class Demo {
	public static void main(String[] args) {
		
//		String[] arr = { "uday", "kiran", "darla", null};
		String[] arr = new String[10];
		Optional<String> val = Optional.ofNullable(arr[4]);
		System.out.println(val.isPresent() ? val : "empty");
		
//		Optional<String> val2 = Optional.of(arr[4]);
//		val2.ifPresent(v -> System.out.println(v.toUpperCase() ) );
		
		arr[4] = "modified";
		Optional<String> val3 = Optional.ofNullable(arr[4]);
		if (val3.isPresent()) {
			System.out.println(val3.get());
		}
		
		Optional<String> name = Optional.ofNullable(null);

		System.out.println(name.orElse("Default")); // Prints: Default

		System.out.println(name.orElseGet(() -> "Generated Default")); // Lazy

		// Throws if empty
//		 System.out.println(name.orElseThrow(() -> new RuntimeException("Name is missing")));
		 
		 Optional<String> name2 = Optional.of("Uday");

		 name2.map(String::toUpperCase)       // Transforms if present
		     .filter(n -> n.startsWith("U")) // Filters result
		     .ifPresent(System.out::println); // Prints UDAY

	}
}
