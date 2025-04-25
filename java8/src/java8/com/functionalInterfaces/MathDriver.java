package java8.com.functionalInterfaces;

public class MathDriver {
	public static void main(String[] args) {
		MathOperations<Integer, Integer> ob = (a, b) -> a - b;
		int res = ob.doCal(20, 30);
		System.out.println(res);

	}
}
