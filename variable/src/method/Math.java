package method;

public class Math {

	private double pi = 3.14;

	public double getRectangle(double r) {
		return r * r;
	}

	public double getArea(double radius) {
		return radius * radius * pi;
	}

	public int sum(int a, int b) {
		return a + b;
	}

	public double sum(double a, double b) {
		return a + b;
	}

	// int 배열의 합 구하는 메소드.
	public int getArySum(int[] ary) {
		int sum = 0;
		for (int num : ary) {
			sum += num;
		}
		return sum;
	}

	// 사람의 적정 몸무게 구하는 메소드.(Person)
	public double getProperWeight(Person p1) {
		// (키 - 100) * 0.9;
		double properWeight = (p1.height - 100) * 0.9;
		return properWeight;
	}

	public double getProperWeight(double height) {
		// (키 - 100) * 0.9;
		double properWeight = (height - 100) * 0.9;
		return properWeight;
	}
}
