package variable2;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setSName("이창호");
		s1.setSName("Leechangho");
		s1.setSNo(111111);
		s1.setSNo(222222);
		s1.setEScore(80);
		s1.setMScore(70);

		s1.studentInfo();
		System.out.println("합계점수:" + s1.totalScore());
	}
}
