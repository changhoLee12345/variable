package array;

public class MorningCode {
	public static void main(String[] args) {
		int[][] intAry = new int[5][5];
		int num = 1;
		for (int i = 0; i < intAry.length; i++) {
			for (int j = 0; j < intAry[i].length; j++) {
				intAry[i][j] = num++;
			}
		}
		int[][] intAry2 = { //
				{ 1, 2, 3, 4, 5 }, //
				{ 6, 7, 8, 9, 10 }, //
				{ 11, 12, 13, 14, 15 }, //
				{ 16, 17, 18, 19, 20 } //
		};

		String[] strAry = { "Hello", "World" };
		for (String str : strAry) {
			System.out.println(str);
		}

//		for (int i = 0; i < intAry.length; i++) {
//			for (int j = 0; j < intAry[i].length; j++) {
//				System.out.print(intAry[i][j] + " ");
//			}
//			System.out.println();
//		}
	}
}
