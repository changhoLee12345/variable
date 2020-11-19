package array;

public class MethodExample1 {
	public static void main(String[] args) {
		showInfo("45");
		int result = showDouble(45);
		System.out.println("반환값: " + result);
		System.out.println("반환: " + showDouble(33.2));
	}

	public static void showInfo(String name) {
		System.out.println("안녕하세요. " + name + "입니다.");
	}

	public static int showDouble(int num) {
		return num * 2;
	}

	public static double showDouble(double num) {
		return num * 2;
	}

	// 정수형 변수 2개를 받아서 두수의 합을 반한해주는 메소드(sum)
	public static int sum(int a, int b) {
		int result = 0;
		result = a + b;
		return result;
	}
	// 정수형 변수 3개를 받아서 세수의 곱을 반환 메소드(multi)
	// double 2개를 받아서 큰수/작은수 (divide)
}
