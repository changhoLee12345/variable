package variable;

public class ArrayExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;

		int[] numbers = { 10, 20, 30, 40, 50 };
		numbers[1] = 200;
		System.out.println(numbers[1]);

		int sum = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println(numbers[i]);
			sum += numbers[i];
		}
		System.out.println("합: " + sum);

		String[] strings = { "Hello", "World", //
				"Nice", "To", "Meet" };
		for (int i = 0; i < strings.length; i++) {
			System.out.println();
		}

	}
}
