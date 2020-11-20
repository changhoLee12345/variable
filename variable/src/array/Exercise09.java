package array;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("---------------");
			System.out.println("1.학생수2.점수입력3.점수리스트4.분석5.종료");
			System.out.println("---------------");
			int selectNo = scanner.nextInt();
			if (selectNo == 1) {
				// 학생수 입력.
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				System.out.println("배열크기: " + scores.length);
			} else if (selectNo == 2) {
				// 학생점수 입력.
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "] >");
					scores[i] = scanner.nextInt();
				}
			} else if (selectNo == 3) {
				// 리스트
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "] : " + scores[i]);
				}
				System.out.println();
			} else if (selectNo == 4) {
				// 분석: 최고점수, 평균점수.
				int sum = 0, maxValue = 0;
				double avg = 0;

				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					if (maxValue < scores[i]) {
						maxValue = scores[i];
					}
				}
				avg = (double) sum / scores.length;
				System.out.println("최고점수:" + maxValue);
				System.out.println("평균점수: " + avg);

			} else if (selectNo == 5) {
				run = false;
			}
		} // end of while
		System.out.println("프로그램 종료.");

	} // end of main
} // end of class
