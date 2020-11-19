package variable2;

public class Student {
	// 필드
	private String sName;// 이름
	private int sNo;// 학번
	private double mScore;// 수학점수
	private double eScore;// 영어점수

	// 메소드
	public void studentInfo() {
		System.out.println("이름: " + sName + ", 학번: " + sNo + " 입니다.");
	}
	public double totalScore() {
		return mScore + eScore;
	}
	public void setSName(String sName) {
		this.sName = sName;
	}
	public void setSNo(int sNo) {
		this.sNo = sNo;
	}
	public void setMScore(double mScore) {
		this.mScore = mScore;
	}
	public void setEScore(double eScore) {
		this.eScore = eScore;
	}
}
