package java8.com.functionalInterfaces;

public class CalculatorDiverClass {
	public static void main(String[] args) {
		CalculatorImpl ob = new CalculatorImpl();
		ob.doSomething();
		
		// or
		Calculator ob2 = new Calculator() {
			@Override
			public void doSomething() {
				// TODO Auto-generated method stub
				System.out.println("Implenented inside anonymouse class");
			}
		};
		
		ob2.doSomething();
		
		// or 
		// with lamda
		Calculator objectWithLambda = () -> System.out.println("Implemented with lambda");
		objectWithLambda.doSomething();
	}
}
